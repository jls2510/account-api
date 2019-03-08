package com.scratch.util

import com.scratch.MyResourceConfig
import org.apache.logging.log4j.LogManager
import org.jooq.exception.DataAccessException
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class ExceptionJsonResponse : ExceptionMapper<Exception> {

    val log = LogManager.getLogger(ExceptionJsonResponse::class.java.name)

    @Produces(MediaType.APPLICATION_JSON)
    override fun toResponse(e: Exception): Response {

        val jsonResponse = GenericResponseModel(false)

        log.debug(e)

        jsonResponse.apply {
            message = e.message.toString()
            errors = e.stackTrace.toList()
        }

        if (e is HttpPassThruException) {
            log.debug("e is an HttpPassThruException")
            return Response.status(e.errorCode)
                    .entity(jsonResponse)
                    .build()
        } else if (e is DataAccessException) {
            log.debug("e is a DataAccessException")
            jsonResponse.apply {
                message = MyResourceConfig.getConfigProperty("error_message") + " " + " Could not connect to the Postgres Database. Please try again shortly."
                errorCode = 500.toString()
            }
        } else if (e is RuntimeException) {
            log.debug("e is a RuntimeException")
            jsonResponse.apply {
                errorCode = e.toString()
            }
        }

        return Response
                .status(500)
                .entity(jsonResponse)
                .build()
    }
}

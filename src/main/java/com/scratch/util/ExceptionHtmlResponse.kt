package com.scratch.util

import org.apache.logging.log4j.LogManager
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class ExceptionHtmlResponse : ExceptionMapper<Exception> {

    val log = LogManager.getLogger(ExceptionHtmlResponse::class.java.name)

    @Produces(MediaType.TEXT_HTML)
    override fun toResponse(e: Exception): Response {

        var htmlResponse: String = "<h1>Error:</h1>"

        log.debug(e)

        if (e is HttpPassThruException) {
            log.debug("e is an HttpPassThruException")
            htmlResponse += "error code: 500<br /><br />"
        } else if (e is RuntimeException) {
            log.debug("e is a RuntimeException")
            htmlResponse += "error code: " + e.toString() + "<br /><br />"
        }

        htmlResponse += "<h3>message: " + e.message.toString() + "</h3><br /><br />"
        htmlResponse += "errors: " + e.stackTrace.toList() + "<br /><br />"

        return Response
                .status(500)
                .entity(htmlResponse)
                .header("Content-type", "text/html")
                .build()

    }
}

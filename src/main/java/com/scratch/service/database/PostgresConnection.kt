package com.scratch.service.database

import com.scratch.MyResourceConfig
import com.scratch.util.HttpPassThruException
import org.apache.logging.log4j.LogManager
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import java.sql.Connection
import java.sql.DriverManager
import java.time.LocalDateTime
import javax.ws.rs.ext.Provider

@Provider
class PostgresConnection : AbstractConnection() {

    companion object {

        @JvmStatic
        val log = LogManager.getLogger(PostgresConnection::class.java.name)

        val url = MyResourceConfig.config("PG_SERVER")
        val userName = MyResourceConfig.config("PG_USER")
        val password = MyResourceConfig.config("PG_PASSWORD")

        @JvmStatic
        private var conn: Connection? = null
        @JvmStatic
        private var connTimestamp: LocalDateTime? = null

    }

    private fun reconnect() {
        log.debug("PostgresConnection.reconnect().")
        try {
            conn = DriverManager.getConnection(url, userName, password)
            connTimestamp = LocalDateTime.now()
        } catch (e: Exception) {
            conn = null
            log.debug(e.message)
            //e.printStackTrace()
            throw HttpPassThruException(MyResourceConfig.config("error_message") + " Could not connect to the Postgres Database. Please try again shortly.")
        }
    } // reconnect()

    private fun checkConnection() {
        // validate connection
        if (conn == null || connTimestamp == null) {
            log.debug("conn is null")
            reconnect()
        } else if (connTimestamp!!.plusSeconds(60).isBefore(LocalDateTime.now()) && !conn!!.isValid(3)) {
            conn!!.close()
            log.debug("conn is not valid")
            reconnect()
        }
    } // checkConnection()

    override fun jooq(): DSLContext {

        //log.debug("PostgresConnection.jooq()")

        checkConnection()

        return DSL.using(conn, SQLDialect.POSTGRES_9_4)

    } // jooq()

}

package com.scratch.service.database;

import com.scratch.MyResourceConfig;
import com.scratch.util.HttpPassThruException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.ws.rs.ext.Provider;

@Provider
public class MySQLConnection extends AbstractConnection {


    private static final Logger log = LogManager.getLogger(MySQLConnection.class.getName());

    private static final String url = MyResourceConfig.config("MYSQL_SERVER");
    private static final String userName = MyResourceConfig.config("MYSQL_USER");
    private static final String password = MyResourceConfig.config("MYSQL_PASSWORD");

    private Connection conn = null;
    private LocalDateTime connTimestamp = null;

    /**
     *
     * @throws HttpPassThruException
     */
    public MySQLConnection() throws HttpPassThruException {
        checkConnection();
    }

    /**
     *
     * @throws HttpPassThruException
     */
    private void reconnect() throws HttpPassThruException {
        log.debug("MySQLConnection.reconnect().");
        try {
            conn = DriverManager.getConnection(url, userName, password);
            connTimestamp = LocalDateTime.now();
        } catch (SQLException e) {
            conn = null;
            log.debug(e.getMessage());
            //e.printStackTrace()
            String errorMessage = MyResourceConfig.config("error_message") + " Could not connect to the Database. Please try again shortly.";
            throw new HttpPassThruException(errorMessage);
        }
    } // reconnect()

    /**
     *
     * @throws HttpPassThruException
     */
    private void checkConnection() throws HttpPassThruException {
        // validate connection
        try {
            if (conn == null || connTimestamp == null) {
                log.debug("conn is null");
                reconnect();
            } else if (connTimestamp.plusSeconds(60).isBefore(LocalDateTime.now()) && !(conn.isValid(3))) {
                conn.close();

                log.debug("conn is not valid");
                reconnect();
            }
        } catch (SQLException e) {
            String errorMessage = MyResourceConfig.config("error_message") + " Could not connect to the Database. Please try again shortly.";
            throw new HttpPassThruException(errorMessage);
        }
    } // checkConnection()


    @Override
    /**
     *
     */
    public DSLContext jooq() throws HttpPassThruException {

        log.debug("MySQLConnection.jooq()");

        checkConnection();

        return DSL.using(conn, SQLDialect.POSTGRES_9_4);

    } // jooq()

    /**
     *
     * @return
     */
    public Connection getConnection() throws HttpPassThruException {
        checkConnection();
        return conn;
    }

}


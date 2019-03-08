package com.scratch.service.database;

import com.scratch.MyResourceConfig;
import com.scratch.util.HttpPassThruException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import javax.ws.rs.ext.Provider;

@Provider
public class MySQLConnection extends AbstractConnection {

    private static final Logger log = LogManager.getLogger(MySQLConnection.class.getName());

    private static volatile HashMap<String, Connection> connections = new HashMap<String, Connection>();
    private static volatile HashMap<String, LocalDateTime> connectionTimestamps = new HashMap<String, LocalDateTime>();

    /**
     * @throws HttpPassThruException
     */
    private MySQLConnection() throws HttpPassThruException {

    }

    /**
     * @throws HttpPassThruException
     */
    private static synchronized Connection reconnect(String db_name) throws HttpPassThruException {
        //System.out.println("MySQLConnection.reconnect(" + db_name + ").");
        Connection conn;
        try {
            String url = MyResourceConfig.getConfigProperty(db_name + ".URL");
            String userName = MyResourceConfig.getConfigProperty(db_name + ".USER");
            String password = MyResourceConfig.getConfigProperty(db_name + ".PASSWORD");
            conn = DriverManager.getConnection(url, userName, password);
            connections.put(db_name, conn);
            connectionTimestamps.put(db_name, LocalDateTime.now());
            log.debug("connection created.");
        } catch (SQLException e) {
            log.debug("MySQLConnection.reconnect(" + db_name + ") THREW SQLException.");
            conn = null;
            //log.debug(e.getMessage());
            e.printStackTrace();
            String errorMessage = MyResourceConfig.getConfigProperty("error_message") + " Could not connect to the Database. Please try again shortly.";
            throw new HttpPassThruException(errorMessage);
        }
        return conn;
    } // reconnect()

    /**
     * @throws HttpPassThruException
     */
    private static synchronized Connection checkConnection(String db_name) throws HttpPassThruException {
        //System.out.println("MySQLConnection.checkConnection(" + db_name + ").");
        // validate connection
        Connection conn = connections.get(db_name);
        LocalDateTime connTimestamp = connectionTimestamps.get(db_name);
        try {
            if (conn == null || connTimestamp == null) {
                log.debug("conn is null");
                conn = reconnect(db_name);
            } else if (connTimestamp.plusSeconds(60).isBefore(LocalDateTime.now()) && !(conn.isValid(3))) {
                conn.close();

                log.debug("conn is not valid");
                conn = reconnect(db_name);
            }
        } catch (SQLException e) {
            String errorMessage = MyResourceConfig.getConfigProperty("error_message") + " Could not connect to the Database. Please try again shortly.";
            throw new HttpPassThruException(errorMessage);
        }

        return conn;
    } // checkConnection()


    @Override
    /**
     *
     */
    public DSLContext jooq(String db_name) throws HttpPassThruException {

        log.debug("MySQLConnection.jooq(" + db_name + ")");

        Connection conn = checkConnection(db_name);

        return DSL.using(conn, SQLDialect.POSTGRES_9_4);

    } // jooq()

    /**
     * @return
     */
    public static Connection getConnection(String db_name) throws HttpPassThruException {

        //System.out.println("MySQLConnection.getConnection(" + db_name + ").");

        Connection conn = checkConnection(db_name);

        return conn;
    }

    public static void closeConnection(Connection conn) {
        //System.out.println("MySQLConnection.closeConnection().");
        try {
            if (null != conn) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void closeResultset(ResultSet rs) {
        try {
            if (null != rs) {
                rs.close();
                rs = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void closePreparedStatement(PreparedStatement pstmt) {
        try {
            if (null != pstmt) {
                pstmt.close();
                pstmt = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}


package com.scratch.service.database;

import com.scratch.MyResourceConfig;
import com.scratch.util.HttpPassThruException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.impl.DefaultConfiguration;

import java.sql.*;
import java.util.HashMap;
import javax.ws.rs.ext.Provider;

@Provider
public class MySQLConnection extends AbstractConnection {

    private static final Logger log = LogManager.getLogger(MySQLConnection.class.getName());

    private static volatile HashMap<String, HikariDataSource> hikariDataSources = new HashMap<String, HikariDataSource>();

    /**
     * @throws HttpPassThruException
     */
    private MySQLConnection() throws HttpPassThruException {

    }

    /**
     *
     * @param db_name
     * @return
     */
    public static Configuration getJooqConfiguration(String db_name) {
        Configuration configuration = new DefaultConfiguration();
        HikariDataSource ds = getDataSource(db_name);

        configuration.set(ds);
        configuration.set(SQLDialect.MYSQL);
        return configuration;
    }

    /**
     *
     * @param db_name
     * @return
     */
    private static synchronized HikariDataSource initDataSource(String db_name) {
        HikariDataSource ds = hikariDataSources.get(db_name);

        if (ds == null) {
            String url = MyResourceConfig.getConfigProperty(db_name + ".URL");
            String userName = MyResourceConfig.getConfigProperty(db_name + ".USER");
            String password = MyResourceConfig.getConfigProperty(db_name + ".PASSWORD");

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(url);
            config.setUsername(userName);
            config.setPassword(password);
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(1);
            config.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds = new HikariDataSource(config);
            hikariDataSources.put(db_name, ds);
        }

        return ds;

    } // initDataSource()

    @Override
    /**
     *
     */
    public DSLContext jooq(String db_name) throws HttpPassThruException {

        DSLContext returnValue = null;
        log.debug("MySQLConnection.jooq(" + db_name + ")");

        Connection conn = null;
        HikariDataSource ds = getDataSource(db_name);
        try {
            conn = ds.getConnection();
        } catch (Exception e) {

        }

        if (conn != null) {

            returnValue = DSL.using(conn, SQLDialect.MYSQL_5_7);
        }

        return returnValue;

    } // jooq()

    /**
     * @return
     */
    public static HikariDataSource getDataSource(String db_name) {
        //System.out.println("MySQLConnection.getConnection(" + db_name + ").");

        HikariDataSource ds = hikariDataSources.get(db_name);

        if (ds == null) {
            ds = initDataSource(db_name);
        }

        return ds;
    }

    /**
     *
     * @param db_name
     */
    public static void closeDataSource(String db_name) {
        //System.out.println("MySQLConnection.closeDataSource().");
        HikariDataSource ds = getDataSource(db_name);
        try {
            if (ds != null) {
                ds.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * @param db_name
     * @return
     */
    public static Connection getConnection(String db_name) {
        Connection conn = null;
        try {
            conn = getDataSource(db_name).getConnection();
        } catch (Exception e) {

        }
        return conn;
    }

}

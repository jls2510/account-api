package com.scratch.service.database;

import java.sql.Statement;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MySQLConnectionTest {
    private static HikariDataSource hikariDataSource;

    private static final String db_name = "jv_b2c";

    @BeforeClass
    public static void beforeClass() {
        try {
            hikariDataSource = MySQLConnection.getDataSource(db_name);
        } catch (Exception e) {

        }
    }

    @AfterClass
    public static void afterClass() {
        try {
            MySQLConnection.closeDataSource(db_name);
        } catch (Exception e) {

        }
    }

    @Test
    public void closeStatementShouldCloseStatement() {
        try {
            Statement statement = hikariDataSource.getConnection().createStatement();
            statement.close();
            Assert.assertTrue(statement.isClosed());
        } catch (Exception e) {
            Assert.fail();
        }
    }

}
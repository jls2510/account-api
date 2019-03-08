package com.scratch.service.database;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MySQLConnectionTest {
    private static Connection connection;

    @BeforeClass
    public static void beforeClass() {
        try {
            connection = MySQLConnection.getConnection("jv_b2c");
        } catch (Exception e) {

        }
    }

    @AfterClass
    public static void afterClass() {
        try {
            MySQLConnection.closeConnection(connection);
        } catch (Exception e) {

        }
    }

    @Test
    public void closeStatementShouldCloseStatement() {
        try {
            Statement statement = connection.createStatement();
            MySQLConnection.closeStatement(statement);
            Assert.assertTrue(statement.isClosed());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void closeStatementWithNullShouldNotThrow() {
        MySQLConnection.closeStatement(null);
    }
}
package com.kodilla.jdbc;


import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    ////TEST Z KODILLI START
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT *from USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    ////KONIEC TESTU KODILLI

    ////MÓJ TEST Z ZADANIA
    @Test
    public void shouldReturn2UsersHaving2posts()throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT U.LASTNAME, U.FIRSTNAME, count(*) as POST_NUMBER\n" +
                "FROM USERS U \n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY U.LASTNAME, U.FIRSTNAME\n" +
                "HAVING COUNT(*)>=2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME")+ ","+
                    rs.getInt("POST_NUMBER")
            );
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }


}

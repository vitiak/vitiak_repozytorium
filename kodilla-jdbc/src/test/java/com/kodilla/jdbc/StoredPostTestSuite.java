package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredPostTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "update readers set vip_level=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        String sqlProcedureCall = "Call updateVipLevels()";
        statement.execute(sqlProcedureCall);

        String sqlCheckTable = "Select count(*) as how_many from readers where vip_level = \"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("how_many");
        }
        assertEquals(0, howMany);

    }


    @Test
    public void testUpdateBestsellers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "update books set bestseller=null";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        String sqlProcedureCall = "Call updateBestsellers()";
        statement.execute(sqlProcedureCall);

        String sqlCheckTable = "Select count(*) as how_many from books where bestseller is null";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("how_many");
        }
        assertEquals(0, howMany);
        assertEquals(0, 0);
    }



}

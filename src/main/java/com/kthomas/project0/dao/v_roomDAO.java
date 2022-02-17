package com.kthomas.project0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.kthomas.project0.driver.Driver.conn;


public class v_roomDAO {

    Statement statement = conn.createStatement();
    ResultSet rs = statement.executeQuery("Select * From catacomb");

    public v_roomDAO() throws SQLException {
        while(rs.next()) {
            System.out.println(rs.getString("roomdesc"));
        }
    }
}

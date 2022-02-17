package com.kthomas.project0.driver;

import com.kthomas.project0.dao.v_roomDAO;
import com.kthomas.project0.util.KTConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Driver {
    public static Connection conn = KTConnectionUtil.getConnection();
    public static void main(String[] args) throws SQLException {
        v_roomDAO catacomb = new v_roomDAO();
    }
}

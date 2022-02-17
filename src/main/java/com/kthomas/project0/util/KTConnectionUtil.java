package com.kthomas.project0.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class KTConnectionUtil {
    private static Connection conn;
    public KTConnectionUtil() {
    }

    public static Connection getConnection(){
        try{
          FileInputStream ktpropertiesInput = new FileInputStream("C:\\Users\\necsk\\Documents\\Revature\\KTSQL.properties");

          Properties propers = new Properties();
          propers.load(ktpropertiesInput);

          String url = (String) propers.get("url");
          String username = (String) propers.get("username");
          String password = (String) propers.get("password");

          if(conn == null){
              try{
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  conn = java.sql.DriverManager.getConnection(url, username, password);
              }catch(SQLException e){
                  e.printStackTrace();
              } catch (ClassNotFoundException e) {
                  e.printStackTrace();
              }
          }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        return conn;
    }
}

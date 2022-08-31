package hms.JavaSource.hotel;

import java.sql.*;

public class conn{

    Connection c;
    Statement s;
  
  private static final String jdbcURL = "jdbc:sqlserver://localhost:1433;databasename=hms;integratedSecurity=true;";

    public conn(){
        try {
            c = DriverManager.getConnection(jdbcURL);
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

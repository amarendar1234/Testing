package amar;

import java.sql.Connection;
import java.sql.DriverManager;




public class TestMYSQLDB {

	   public static void main(String[] args) {
	        Connection conn = null;

	        try {
	            String userName = "sql12182527";
	            String password = "J8zHT8zzzW";

	            String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12182527";
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            conn = DriverManager.getConnection(url, userName, password);
	            System.out.println("Database connection established");
	        } catch (Exception e) {
	            System.err.println("Cannot connect to database server");
	            System.err.println(e.getMessage());
	            e.printStackTrace();
	        } finally {
	            if (conn != null) {
	                try {
	                    conn.close();
	                    System.out.println("Database Connection Terminated");
	                } catch (Exception e) {}
	            }
	        }
	    }

}

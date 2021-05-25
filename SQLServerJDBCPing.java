/*=====================================================================
Name:        SQLServerJDBCPing.java
Description: A simple SQL Server JDBC java file that can be used to
             ping SQL Server DBs on Linux
=====================================================================*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectURL {
    public static void main(String[] args) {

        //Checks args
        if (args.length != 1) {
            System.out.println("Invalid number of arguments: Must provide JDBC string to test as argument");
            return;
        }

        // Create a variable for the connection string.
        String connectionUrl = args[0];

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT DB_NAME() AS [Current Database]";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("Current Database"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

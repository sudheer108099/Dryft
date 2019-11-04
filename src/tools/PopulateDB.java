package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PopulateDB {
    private static void makeTables(Connection conn) {
        makeUserTable(conn);
    }

    private static void makeUserTable(Connection conn) {
        String createUserTable = "CREATE TABLE users (" +
                "email TEXT PRIMARY KEY," +
                "fullname TEXT," +
                "password TEXT," +
                "salt TEXT," +
                "sex CHAR(1)," +
                "balance INT" +
                ");";
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.execute(createUserTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection conn;
        {
            try {
                conn = DriverManager.getConnection("jdbc:sqlite:dryft.sqlite3");
                makeTables(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

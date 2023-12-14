package lubos.sukup.prvypolrok.jdbc;

import java.sql.*;

public class DBConnection {
    private String DB_URL = "jdbc:h2:C:/Users/lubos/PRACA/JAVA/skola/IT4-2023-2024/notes/mydb";
    private String USER = "sa";
    private String PASS = "sa";
    private DBConnection(){

    }
    public static DBConnection databaseCon;
    public static DBConnection getInstance() {
        if (databaseCon == null) {
            return new DBConnection();
        } else {
            return databaseCon;
        }
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

}

package lubos.sukup.prvypolrok.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyConnectionInsert {

    public static void main(String[] args) {


        String DB_URL = "jdbc:h2:C:/Users/lubos/PRACA/JAVA/skola/IT4-2023-2024/notes/mydb";
        String USER = "sa";
        String PASS = "sa";
        Statement stmt;
        Connection conn;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            stmt.execute("INSERT INTO  UZIVATELIA(ID,MENO,PRIEZVISKO,ADRESA)" +
                    "VALUES(4,'STVRTE MENO','STVRTE PRIEZVISKO', 'STVRTA ADRESA');"); // Execute query
            stmt.close(); // close statement
            conn.close(); // close connection
        }catch (SQLException ex){

        }
    }
}

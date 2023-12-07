package lubos.sukup.prvypolrok.jdbc;


import java.sql.*;

public class MyConnection {

    public static void main(String[] args) throws SQLException {


        String DB_URL = "jdbc:h2:C:/Users/LubosSukup/JAVA/skola/3IT-2022-2023-GUI/notes/mydb";
        String USER = "sa";
        String PASS = "sa";
        Statement stmt;

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        ResultSet rs
                = stmt.executeQuery("SELECT * FROM UZIVATELIA"); // Execute query
        while (rs.next()){
            UzivateliaDTO uzivateliaDTO = new UzivateliaDTO(rs.getInt("ID"), rs.getString("MENO"),
                    rs.getString("PRIEZVISKO"), rs.getString("ADRESA"));

            System.out.println(uzivateliaDTO); // Print result
        }

        stmt.close(); // close statement
        conn.close(); // close connection




    }

}

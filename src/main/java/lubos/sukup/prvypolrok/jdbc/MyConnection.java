package lubos.sukup.prvypolrok.jdbc;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyConnection {

    public static void main(String[] args) throws SQLException {

        List<UzivateliaDTO> uzivateliaDTOS = new ArrayList<>();
        DBConnection dbCon= DBConnection.getInstance();
        Connection  conn = dbCon.getConnection();

        ResultSet rs
                = conn.createStatement().executeQuery("SELECT * FROM UZIVATELIA"); // Execute query
        while (rs.next()){
            UzivateliaDTO uzivateliaDTO = new UzivateliaDTO(rs.getInt("ID"), rs.getString("MENO"),
                    rs.getString("PRIEZVISKO"), rs.getString("ADRESA"));

            uzivateliaDTOS.add(uzivateliaDTO);
        }

    }

}

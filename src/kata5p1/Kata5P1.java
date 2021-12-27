package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static kata5p1.Conexion.*;
import static kata5p1.Consulta.*;

public class Kata5P1 {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:KATA5.db";
        String sql = "CREATE TABLE IF NOT EXISTS EMAIL (\n"
                + " id integer PRIMARY KEY AUTOINCREMENT,\n"
                + " mail text NOT NULL);";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   
}

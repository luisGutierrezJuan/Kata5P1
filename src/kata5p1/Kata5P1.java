package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static kata5p1.Conexion.*;
import static kata5p1.Consulta.*;

public class Kata5P1 {

    public static void main(String[] args) {
        Connection conn = Conexion.connect("KATA5.db");
        Consulta.seeAll(conn);
        Conexion.disconnect(conn);
    }
   
}

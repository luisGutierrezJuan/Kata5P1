package kata5p1.main;

import DataBase.Tabla;
import java.sql.*;
import DataBase.*;
import View.MailListReader;
import java.util.List;

public class Kata5P1 {

    public static void main(String[] args) {
        Connection conn = Conexion.connect("KATA5.db");
        List<String> listaEmails = MailListReader.read("email.txt");
        for (String email : listaEmails){
            Tabla.insert(conn, email);
        }
        Consulta.seeAll(conn);
        Conexion.disconnect(conn);
    }
   
}

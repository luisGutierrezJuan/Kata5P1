package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    public static List<String> listaEmail = new ArrayList<String> ();
    
    public static List<String> read(String fileName){
        File email;
        BufferedReader bReader;
        FileReader fReader;
        try{
            email = new File (fileName);
            fReader = new FileReader(email);
            bReader = new BufferedReader(fReader);
            String linea;
            while ((linea=bReader.readLine()) != null){
                if (linea.contains("@")){
                    listaEmail.add(linea);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return listaEmail;
    }
}

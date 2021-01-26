import java.awt.*;
import java.io.*;

public class Leer {

    public void leer(){
        try{
        FileReader doc = new FileReader("C:\\Users\\Jordi\\Desktop\\Prueba.txt");
        BufferedReader bdoc = new BufferedReader(doc);

        String txt = "";
        while ((txt = bdoc.readLine()) != null) {
            System.out.println(txt);
        }
        doc.close();
    }
    catch(IOException e){
        System.out.println("No se ha encontrado el fichero");
        e.printStackTrace();
        }
    }
}

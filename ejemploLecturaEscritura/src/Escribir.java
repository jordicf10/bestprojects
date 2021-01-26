import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

        public void escribir(){
            //String txt= "\nEscribimos a un fichero con Ilerna Online";

            String txt= JOptionPane.showInputDialog("Inserta el texto que desees en el archivo\n");

            try {
                FileWriter doc = new FileWriter("C:\\Users\\Jordi\\Desktop\\Prueba.txt", true);
                for (int i = 0; i < txt.length(); i++) {
                   
                    doc.write(txt.charAt(i));

                }
                doc.close();
            }
                catch(IOException e){
                e.printStackTrace();
            }
        }
    }


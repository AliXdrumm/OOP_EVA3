/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_lectura_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author licce
 */
public class EVA3_9_Lectura_Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String ruta = "C:\\archivo\\prueba.txt";
            readUsingFiles(ruta);
            readUsingScanner(ruta);
            readUsingBufferedReader(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /*Files lee todo el archivo y lo envia como String*/
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    
    }
    /*Lee el archivo por linea*/
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
        System.out.println("LECTURA DE ARCHIVOS USANDO SCANNER");
        File source = new File(ruta);
    Scanner scanner = new Scanner(source);
    String cade;
    while(scanner.hasNextLine()){//Si no hay una "nextLine" se acabó el archivo
    cade = scanner.nextLine();
        System.out.println(cade);
    }
    }
    public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO BUFFERED READER");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String cade;
        while((cade = br.readLine())!= null){
            System.out.println(cade);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escritura_archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author licce
 */
public class EVA3_10_Escritura_Archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String ruta = "C:\\archivo\\prueba.txt";
    try{
    writeUsingFiles(ruta, "HOLA MUNDO!!");
    writeUsingBufferedWriter(ruta, "HOLA A TODOS");
        writeUsingFileWritewe(ruta, "SALUDOS DESDE JAVA!!!!!");
    }catch(IOException ex){
    ex.printStackTrace();
    }
    
    }
    public static void writeUsingFiles(String ruta, String texto) throws IOException{
        System.out.println("ESCRITURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path, texto.getBytes());
    }
    public static void writeUsingBufferedWriter(String ruta, String texto) throws FileNotFoundException, IOException{
        System.out.println("LECTURA USANDO BUFFERED READER");
        File source = new File(ruta + "ArchivoBufferedWriter.txt");
        FileOutputStream fos = new FileOutputStream(source);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(texto);
        bw.close();
    }
    
    public static void writeUsingFileWritewe(String ruta, String texto) throws IOException{
        System.out.println("ESCRITURA USANDO FILEWRITER");
        File source = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(source);
        fileWriter.write(texto);
        fileWriter.close();
    }
}


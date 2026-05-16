/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_archivos_objetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author licce
 */
public class EVA3_11_Archivos_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO code application logic here
        String ruta = "C:\\archivo\\archivoObjetos.dat";
        try{
        writeObject(ruta);   
       
        }catch(IOException ex){
        ex.printStackTrace();
        }
        try{
            readObject(ruta);
        }catch(EOFException ex){
        ex.printStackTrace();
        }
       
    }
    public static void writeObject(String ruta) throws FileNotFoundException, IOException{
        System.out.println("ESCRITURA DE OBJETOS USANDO OBJETOUTPUTSTREAM");
        File source = new File(ruta);
        FileOutputStream fos = new FileOutputStream(source);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Persona("Alan","Rodriguez", 19));
        oos.writeObject(new Persona("Carlos","Noche", 19));
        oos.writeObject(new Persona("Kevin","Conde", 20));
        oos.close();
        
    }
    public static void readObject(String ruta) throws IOException, ClassNotFoundException{
        System.out.println("LECTURA DE OBJETOS USANDO OBJETOUTOFSTRING");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        while(true){
        Persona perso = (Persona)ois.readObject();
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellido: " + perso.getApellido());
        System.out.println("Edad: " + perso.getEdad());
        //Para controlar la lectura, se debe capturar la excepción
        }
        //ois.close();
    }
}
class Persona implements Serializable{
private String nombre;
private String apellido;
private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
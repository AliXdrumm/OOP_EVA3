/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_excepciones_unchecked;

/**
 *
 * @author licce
 */
public class EVA3_1_Excepciones_unchecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CHECKED---> Lo veremos en manejo de archivos
        //UNCHECKED----> Errores lógicos, prevenibles con buenas prácticas
        //ARITHMETIC EXCEPTION -----> Division entre cero
        
        int x = 100, y = 3, resu;
        resu = x/y;
        System.out.println("Resu x/y = " + resu);
        
        //ArrayIndexOutOfBoundsException
        
        int [] arreglo = new int[5];
        System.out.println(arreglo[3]);
        
        //NullPointerExcepcion
        String cade = null;
        System.out.println(cade.length());
                
    }
    
}


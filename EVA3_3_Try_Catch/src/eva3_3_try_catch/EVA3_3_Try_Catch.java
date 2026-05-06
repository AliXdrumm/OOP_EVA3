/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author licce
 */
public class EVA3_3_Try_Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100, y = 0, resu = 0;
        try{ //Es el codigo que se intenta ejecutar, pero puede generar una excepcion
            resu = x / y;//Este código genera la excepción
            System.out.println("ESTO NUNCA SE EJECUTA!!!!!");
            //MAS INSTRUCCIONES......PERO NO SE EJECUTAN SI HAY UNA EXCEPCION
        }catch(ArithmeticException e){
            //QUE HACEMOS CON LA EXCEPCION
            //NADA IMPIDE QUE VUELVAN A GENERAR UNA EXCEPCION AQUI
            //e.printStackTrace();
            System.out.println("ERROR: DIVISION ENTRE CERO");
        }
        System.out.println("Resultado = " + resu); 
        
    }
    
}

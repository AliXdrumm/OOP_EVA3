/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_try_catch;

/**
 *
 * @author licce
 */
public class EVA3_4_Try_Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100, y = 2, resu = 0;
        String cade = null;
        try{
            resu = x / y;
            System.out.println("TERMINAMOS LA DIVISION");
            System.out.println(cade.length());
            System.out.println("TERMINAS LA OPERACION CON LA CADENA");
        }/*catch(RuntimeException e){
            e.printStackTrace();
        }*/catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
        // TODO code application logic here
    }
    
}

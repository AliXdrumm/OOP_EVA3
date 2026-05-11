/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_manejo_excepciones;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA3_6_Manejo_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int x, y, resu = 0;
        boolean bande = false;
        System.out.println("Valor de X: ");
        x = captu.nextInt();
        
        
        while(true){
        System.out.println("Valor de Y: ");
        y = captu.nextInt();
        captu.nextLine();

        try{
       resu = x/y;
       bande = true;
        }catch(ArithmeticException e){
            System.out.println("El valor de Y no puede ser 0 (cero), Vuelva a capturar el valor");
            bande = false;
        }
        if(bande)
            break;
        }
        
        System.out.println(x + "/" + y + " = " + resu);
        
    }
    
}

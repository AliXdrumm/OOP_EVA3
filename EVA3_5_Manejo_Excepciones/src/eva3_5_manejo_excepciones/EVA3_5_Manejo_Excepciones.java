/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_manejo_excepciones;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA3_5_Manejo_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int x, y, resu;
        System.out.println("Valor de X: ");
        x = captu.nextInt();
        do{
        System.out.println("Valor de Y");
        y = captu.nextInt();
        captu.nextLine();
        }while( y == 0);
        
       resu = x/y;
        System.out.println(x + "/" + y + " = " + resu);
    }
    
}

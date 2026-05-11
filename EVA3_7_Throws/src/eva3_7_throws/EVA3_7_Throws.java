/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throws;

/**
 *
 * @author licce
 */
public class EVA3_7_Throws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //El error viene de pasar mal los datos, aqui es donde debe corregirse
            System.out.println("Resultado = " + Division(10,0));
        } catch (Exception e) {
    e.printStackTrace();
        }
    }
    //throws es principalmente para excepciones de tipo checked
   public static int Division(int x, int y) throws Exception{
   int resu = 0;
   
   if(y == 0){//El error no se corrige aqui, sino en la llamada a division
       //throw nos permite lanzar una excepció  de cualquier clase
   throw new Exception("El divisor no puede ser cero!!");
   }
   
   resu = x/y;
   return resu;
   } 
}



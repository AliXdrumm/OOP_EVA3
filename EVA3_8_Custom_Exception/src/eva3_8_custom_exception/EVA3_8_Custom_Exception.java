/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exception;
import java.util.logging.Logger;


/**
 *
 * @author licce
 */
public class EVA3_8_Custom_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try {
            throw new MiCheckedException("Excepcion personalizada");

        } catch (MiCheckedException ex) {
            Logger.getLogger(EVA3_8_Custom_Exception.class.getName());
        }
    }

}
class MiException extends RuntimeException {

    public MiException(String message) {
        super(message);
    }

}

class MiCheckedException extends Exception {

    public MiCheckedException(String message) {
        super(message);
    }

}
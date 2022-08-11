package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
 * but exactly 4 digits or exactly 6 digits. If the function is passed a valid
 * PIN string, return true, else return false.
 *
 * @author developer
 */
public class ValidatePIN {

    public static boolean isValid(String pin) {
        int tamanioPin = pin.length();
        
        try {
            
            if ( tamanioPin == 4 || tamanioPin == 6) {
                Integer convNumber = Integer.parseInt(pin);
                
                if (convNumber.getClass().toString().contains("Integer")) {
                    return true;
                }
                
            } else {
                return false;
            }
            
        } catch (NumberFormatException ex) {
            //ex.printStackTrace();
            return false;
        }
        
    return false;
    }

}

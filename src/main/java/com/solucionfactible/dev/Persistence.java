package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative
 * persistence, which is the number of times you must multiply the digits in num
 * until you reach a single digit.
 *
 * @author developer
 */
public class Persistence {

    public static int persistence(long num) {
        String[] myArr = String.valueOf(num).split("");
        int contador = 0, resMultipli = 1, iterador = 0, tamanioArr = myArr.length;

        if (tamanioArr > 1) {
            
            while (iterador < myArr.length) {
                resMultipli *= Integer.valueOf(myArr[iterador]);
                
                if (iterador == (myArr.length - 1)) {
                    contador++;	
                    
                    if (String.valueOf(resMultipli).split("").length > 1) {
                        myArr = String.valueOf(resMultipli).split("");
                        iterador = -1;
                        resMultipli = 1;
                    }
                    
                }
                
                iterador++;
                
            }
            
        }
        
        return contador;
    }

}

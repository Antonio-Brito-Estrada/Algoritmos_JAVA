package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
    public static char findMissingLetter(char[] array) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z'},
               abcMayus = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'U', 'V', 'W', 'X', 'Y', 'Z'},
               arrMayusOrMinus = new char[26];
        char posicion0 =array[0], resultado = ' ';
        boolean minusculas = false;
        
        if(array.length > 0){
            
            for (int i = 0; i < abc.length; i++) {
              if (posicion0 == abc[i]) {
                  minusculas = true;
                  break;
              }  
            }
            
            arrMayusOrMinus = minusculas ? abc : abcMayus;
            
            for (int i = 0; i < arrMayusOrMinus.length; i++) {
                if (arrMayusOrMinus[i] == posicion0) {
                    for (int x = 0; x < array.length; x++) {
                        if (arrMayusOrMinus[i + x] != array[x]) {
                            resultado = arrMayusOrMinus[i + x];
                            return resultado;
                        }
                    }
                }
            }
            
        }
    return resultado;   
    }

}

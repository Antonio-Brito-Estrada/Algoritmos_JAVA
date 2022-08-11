package com.solucionfactible.dev;

import static java.lang.Integer.SIZE;

/**
 * diff subtracts one list from another and returns the result. It should remove
 * all values from list a, which are present in list b keeping their order.
 *
 * @author developer
 */
public class ArrayDiff {

    public static int[] diff(int[] a, int[] b) {
        int[] diffArr = new int[SIZE], diffEntreArr = null;
        int contador = 0, posicionArr =0,
            tamanioArrA = a.length, tamanioArrB = b.length;
        
        if (tamanioArrA == 0 || tamanioArrB == 0) {
            return a;
        } else {
            
            for (int i = 0; i < tamanioArrA; i++) {
                contador = 0;
                
                for (int x = 0; x < tamanioArrB; x++) {
                    if (a[i] != b[x]) {
                        contador++;
                    }
                    
                    if (x == (tamanioArrB - 1) && contador == tamanioArrB) {
                        diffArr[posicionArr] = a[i];
                        posicionArr++;
                    }
                    
                }
                
            }
            
        }
        
        diffEntreArr = new int[posicionArr];
        
        for (int i = 0; i < diffArr.length; i++) {
            if(i <=(posicionArr-1)){
                diffEntreArr[i] = diffArr[i];
            }else{
                break;
            }
        }
        
        return diffEntreArr;
    }

}

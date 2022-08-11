package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
            int numeroCruadrado=0, contador = 0,
                tamanioArrA = a.length, tamanioArrB = b.length;
            
            if(tamanioArrA == tamanioArrB){
                
                for (int i = 0; i < tamanioArrA; i++) {
                      numeroCruadrado = a[i] * a[i];
                      for (int x = 0; x < tamanioArrB; x++) {
                              if(b[x] == numeroCruadrado || b[x] == a[i]){
                                 contador++;
                                 break;
                              } 
                      }
                }
                
                return contador == tamanioArrB ? true: false;
                
            }else{
                return false;
            }	
	}

}

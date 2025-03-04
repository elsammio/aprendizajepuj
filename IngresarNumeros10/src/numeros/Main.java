package numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Solicita al usuario ingresar 10 números, 
		  guárdalos en un arreglo y luego encuentra el mayor y el menor.
		 */
	
        int[] numeros = {5, 2, 9, 2, 7, 100, 4, 0, 8};
        
        //int[] numeros = {1, 1, 1, 1, 1, 1, 1};
		
        int mayor = numeros[0];
        int menor = numeros[0];
        
        for (int i = 0; i < numeros.length; i++) {
			
        	if(numeros[i] > mayor) {
        		
        		mayor = numeros[i];
        		
        	}else if(numeros[i] < menor) {
        		
        		menor = numeros[i];
        		
        	}
		}
 
		System.out.println("El numero mayor es: " + mayor);
		
		System.out.println("El numero menor es: " + menor);
		


		
		/*System.out.println("Los números ingresados son:");
		
		
        for (int numero : numeros) {
        	
            System.out.print(numero + " ");
        }*/
        
	}

}

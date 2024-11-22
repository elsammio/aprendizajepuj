package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Crea un programa que determine si una palabra ingresada es un 
		palíndromo (se lee igual al derecho y al revés*/
		
		//refactorizar este programa con una solución diferente
		
		Operaciones operacion = new Operaciones();
		
		String palabra = operacion.recibirPalabra();
		
		String palabrainvertida = operacion.invertirPalabra(palabra);
		
		if (palabra.equals(palabrainvertida)) {
			
			System.out.println( palabra + " es un palindromo");
			
		} else {
			
			System.out.println( palabrainvertida + " no es un palindromo");

		}
		
	}

}

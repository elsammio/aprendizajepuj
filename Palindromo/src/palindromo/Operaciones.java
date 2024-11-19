package palindromo;

import java.util.Scanner;

public class Operaciones {
	
	public static String recibirPalabra() {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        
        String frase = scanner.next();
		
		return frase;
		
	}
	
	public static String invertirPalabra(String palabra) {
	    StringBuilder palabraInvertida = new StringBuilder();
	    for (int i = palabra.length() - 1; i >= 0; i--) {
	        palabraInvertida.append(palabra.charAt(i)); 

	    }
	    return palabraInvertida.toString(); 

	}
	
	

	

}

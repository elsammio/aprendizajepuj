package diaz.samir.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita tu nombre, por favor: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		entrada.close();
	}

}

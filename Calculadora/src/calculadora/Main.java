package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Crea un programa que funcione como una calculadora básica. 
		 * Debe permitir sumar, restar, multiplicar y dividir dos números ingresados por el usuario.
		 */
		
		Operaciones operacion = new Operaciones();
		
		
		
		System.out.println("Por favor digite una de las siguientes opciones:"
				+ " 1. Sumar"
				+ " 2. Restar"
				+ " 3. Multiplicar"
				+ " 4. Dividir");
		
		int num = operacion.recibirNumero();
		
		System.out.println(num);
		
		if (num == 1) {
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
		}if (num == 2) {
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
		}if (num == 3){
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
		}else if (num == 4){
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
		}

	}

}

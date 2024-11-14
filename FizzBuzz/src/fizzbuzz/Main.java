package fizzbuzz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa que muestre por consola (con un print) los
		 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
		 * cada impresión), sustituyendo los siguientes:
		 * - Múltiplos de 3 por la palabra "fizz".
		 * - Múltiplos de 5 por la palabra "buzz".
		 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
		 */
		
		int num = 100;
		
		for (int i = 1; i <= num; i++) {
			
			if (i % 3 == 0) {
                System.out.println("fizz" + i);
            }
			
		}

		
		

	}

}

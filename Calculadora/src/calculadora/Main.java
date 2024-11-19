package calculadora;



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
	
		
		if (num == 1) {
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
			int suma = operacion.suma(num1, num2);
			System.out.println("la suma de los numeros es: " + suma );
			
		}if (num == 2) {
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
			int resta = operacion.resta(num1, num2);
			System.out.println("la resta de los numeros es: " + resta );
			
		}if (num == 3){
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
			int multi = operacion.multiplicacion(num1, num2);
			
			System.out.println("La multiplicación de los dos numeros es: "+ multi);
			
		}else if (num == 4){
			
			System.out.println("Por favor digite el primer numero: "  );
			int num1 = operacion.recibirNumero();
			
			System.out.println("Por favor digite el segundo numero: "  );
			int num2 = operacion.recibirNumero();
			
			if (num2 != 0) {
				
				int div = operacion.división(num1, num2);
				
				System.out.println("La división de los dos numeros es: "+ div);
			}else {
				
				System.out.println("No se puede dividir por cero");
			}	
			
		}
		

	}

}

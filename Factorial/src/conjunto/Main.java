package conjunto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingreseun número: ");
        
        int num = scanner.nextInt();
		
		long resultado;
		
		Factorial factorial = new Factorial();
		
		
		resultado = factorial.factorial_multiplicacion(num);
		
	
		
		
		
		System.out.println(resultado);
		

	}
}



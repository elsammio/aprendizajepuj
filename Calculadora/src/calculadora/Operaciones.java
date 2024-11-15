package calculadora;

import java.util.Scanner;

public class Operaciones {
	
	public static int recibirNumero(){
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        
        int num = scanner.nextInt();
        
        return num;
		
	}
	
	

}

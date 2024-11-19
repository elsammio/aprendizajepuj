package calculadora;

import java.util.Scanner;

public class Operaciones {
	
	public static int recibirNumero(){
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        
        int num = scanner.nextInt();
        
        return num;
		
	}
	
    public static int suma(int num1, int num2){
		
		int resultado = num1 + num2;
        
        return resultado;
		
	}
    
    public static int resta(int num1, int num2){
		
		int resultado = num1 - num2;
        
        return resultado;
		
	}
    
    public static int multiplicacion(int num1, int num2){
		
		int resultado = num1 * num2;
        
        return resultado;
		
	}
    
    public static int división(int num1, int num2) {
    	
    	int resultado = num1 / num2;
        
        return resultado;
    }
    

	
	

}

package calculadora;

import java.util.Scanner;

public class Operaciones {
	
	public static int recibirNumero(){
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Ingrese un número: ");
            
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            scanner.next(); 
            }
            num = scanner.nextInt();
            
        }while (num <= 0);
        
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

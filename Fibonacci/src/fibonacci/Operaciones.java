package fibonacci;
import java.util.Scanner;

public class Operaciones {
	

	
	public static int recibirNumero(){
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        
        int num = scanner.nextInt();
        
        return num;
		
	}
	
	
	public int fibonacci(int num) {
		
		int num1 = 0;
		
		int num2 = 1;
		
		int resultado = 0;
		
		
		for (int i = 1; i < num; i++) {
			
            resultado = num1 + num2; 
            
            num1 = num2;
            
            num2 = resultado;
      
	    }
		
		return  num2;
	}

	
	
}
	
      
package numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num = 10;
		int[] numeros = new int[10];
		
		for (int i = 0; i < num; i++) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese un numero: ");
			numeros[i]= scanner.nextInt();	
			
		}
		
		System.out.println("Los números ingresados son:");
		
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        
		
		
		

	}

}

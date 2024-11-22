package numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Solicita al usuario ingresar 10 números, 
		  guárdalos en un arreglo y luego encuentra el mayor y el menor.
		 */
		
		
		int menor = 0;
		
		int iguales =0;
		
        int num = 10;
        
		//int[] numeros = new int[num];
		
		int[] prueba = new int[num];
        prueba[0] = 10;
        prueba[1] = 20;
        prueba[2] = 30;
        prueba[3] = 40;
        prueba[4] = 50;
        prueba[5] = 1;
        prueba[6] = 2;
        prueba[7] = 5;
        prueba[8] = 6;
        prueba[9] = 9;
        
        int mayor = prueba[0];
		
		
		for (int i = 0; i < num; i++) {
			
			/*Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese un numero: ");
			numeros[i]= scanner.nextInt();*/
			
			if (mayor > prueba[i]) {
				
				mayor = prueba[i];
				
			} else if (mayor < prueba[i]) {
				
				menor = prueba[i];
			}
		
		}
		
		System.out.println("El numero mayor es: " + mayor);
		
		System.out.println("El numero menor es: " + menor);
		


		
		/*System.out.println("Los números ingresados son:");
		
		
        for (int numero : numeros) {
        	
            System.out.print(numero + " ");
        }*/
        
	}

}

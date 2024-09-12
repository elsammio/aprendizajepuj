package diaz.samir.entradaSalida;

import java.util.*;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero por favor: "));
		
		//System.out.println("la raiz cuadra de " + num + " y su raiz cuadrada es " + Math.sqrt(num));
		
		// Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir introducir un nº por consola.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite un numero: ");
		
		int numero = entrada.nextInt();
		
		double raiz = Math.sqrt(numero);
		
		System.out.println("La raiz de " + numero + " es " + raiz);
		
		//Codigo simplificado
		
		//Modifica el programa del ejercicio anterior para reducir lo máximo posible el nº de líneas de código.
		
        /*Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite un numero: ");
				
		double raiz = Math.sqrt(entrada.nextInt());
		
		System.out.println("La raiz es " + raiz);
		
		entrada.close();*/

	}

}

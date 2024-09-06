package diaz.samir.entradaSalida;

import java.util.*;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero por favor: "));
		
		//System.out.println("la raiz cuadra de " + num + " y su raiz cuadrada es " + Math.sqrt(num));
		
		
		/*Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite un numero: ");
		
		int numero = entrada.nextInt();
		
		double raiz = Math.sqrt(numero);
		
		System.out.println("La raiz de " + numero + " es " + raiz);*/
		
		
        Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite un numero: ");
				
		double raiz = Math.sqrt(entrada.nextInt());
		
		System.out.println("La raiz es " + raiz);
		
		entrada.close();

	}

}

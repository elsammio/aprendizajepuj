package diaz.samir.entradaSalida;

import javax.swing.*;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero por favor: "));
		
		System.out.println("la raiz cuadra de " + num + " y su raiz cuadrada es " + Math.sqrt(num));
		

	}

}

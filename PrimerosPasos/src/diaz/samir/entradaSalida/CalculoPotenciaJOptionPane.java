package diaz.samir.entradaSalida;

import javax.swing.*;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea una clase con el nombre de CalculoPotenciaJOptionPane. Al ejecutar el programa nos debe 
		//pedir introducir dos valores numéricos utilizando una ventana de tipo showInputDialog
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base  por favor: "));
		
		int exponente = Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente  por favor: "));
		
		double resultado = Math.pow(base, exponente);
		
		System.out.println("EL resultado de " + base + " elevado a " + exponente + " es " + resultado );
		
		//Codigo simplificado
		
		//Modifica el programa del ejercicio anterior para reducir lo máximo posible el nº de líneas de código. 
		
		double resultado2 = Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Introduce la base  por favor: ")), Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente  por favor: ")));
		
		System.out.println("El resultado es: " + resultado2);
		
		
		

	}

}

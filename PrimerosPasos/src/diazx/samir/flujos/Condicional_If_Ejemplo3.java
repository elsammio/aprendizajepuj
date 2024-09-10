package diazx.samir.flujos;

import javax.swing.*;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int distancia_colegio;
		
		double renta_familiar;
		
		byte hermanos_centro;
		
		distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia al colegio en KM"));
		
		renta_familiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar"));
		
		hermanos_centro = Byte.parseByte(JOptionPane.showInputDialog("Introduce el numero de hermanos"));
		
		if (distancia_colegio > 10000 && renta_familiar < 20000 && hermanos_centro >= 2 ) {
			
			System.out.println("Usted puede acceder a el beneficio ");
			
		}else {
			
			System.out.println("Usted no es apto para acceder al beneficio");
		}
		
		/* 
		 if (!(distancia_colegio > 10000 && renta_familiar < 20000 && hermanos_centro >= 2 )) {
			
			System.out.println("Usted puede acceder a el beneficio ");
			
		}else {
			
			System.out.println("Usted no es apto para acceder al beneficio");
		}
		*/
		
		
		

	}

}

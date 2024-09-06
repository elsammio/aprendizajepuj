package diazx.samir.flujos;

import javax.swing.*;

public class Condicional_If_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));  
		
		if(edad >= 18) {
			
			System.out.println("Usted es mayor de edad");
			
		}else{
			
			System.out.println("Usted es menor de edad");
			
		}
		

	}

}

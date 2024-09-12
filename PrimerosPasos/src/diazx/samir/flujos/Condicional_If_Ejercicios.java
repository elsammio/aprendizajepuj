package diazx.samir.flujos;

import javax.swing.*;

public class Condicional_If_Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Digite su nombre por favor: ");
		
		String genero = JOptionPane.showInputDialog("Digite su genero por favor: ");
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite su altura por favor: "));
				
		
		int pesoideal;
		
		if(genero.equals("mujer")) {
			
			pesoideal = altura - 120 ;
			
			System.out.println(nombre + " su peso ideal es: " + pesoideal);
			
		}else if(genero.equals("hombre")){
			
            pesoideal = altura - 110 ;
			
			System.out.println(nombre + " su peso ideal es: " + pesoideal);
		}else {
			
			System.out.println("usted no digito nada ");
		}
	}

}

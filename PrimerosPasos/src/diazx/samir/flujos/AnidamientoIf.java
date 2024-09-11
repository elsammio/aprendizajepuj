package diazx.samir.flujos;

import javax.swing.JOptionPane;

public class AnidamientoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite su edad"));
		
		if(edad >= 18) {
			
			String carnet = JOptionPane.showInputDialog("Tienes licencia");
			
			if(carnet.equals("si")) {
				
				JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
				
			}else {
				JOptionPane.showMessageDialog(null, "Sin licencia no puedes comprar el coche");
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "Eres menor de edad, no puedes tener licencia y tampoco coche ");
		}
		

	}

}

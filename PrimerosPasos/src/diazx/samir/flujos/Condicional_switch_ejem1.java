package diazx.samir.flujos;

import javax.swing.JOptionPane;

public class Condicional_switch_ejem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de hijos"));
		
		switch (hijos) {
		case 0:
			System.out.println("La natalidad es baja, tenlo en cuenta");
			break;
			
		case 1:
			System.out.println("Por algo se empieza");
			break;
		case 2:
			System.out.println("Por algo se empieza");
			break;
		case 3:
			System.out.println("Veo que te estas animando");
			break;
		case 4:
			System.out.println("Ya tienes familia numerosa");
			break;
		case 5:
			System.out.println("Forma un equipo de futbol");
			break;

		default:
			
			System.out.println("Esa cantidad de hijos no esta comtemplado");
			
			break;
			
			
		}

	}

}

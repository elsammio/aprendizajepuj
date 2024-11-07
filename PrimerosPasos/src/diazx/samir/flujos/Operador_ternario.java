package diazx.samir.flujos;

import javax.swing.JOptionPane;

public class Operador_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salariot1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario: "));
		
		double salariot2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario: "));
		
		double salario_mayor;
		
		/*if (salariot1 > salariot2) {
			
			salario_mayor= salariot1;
			
		}else salario_mayor = salariot2;*/
		
		 salario_mayor = (salariot1 > salariot2) ? salariot1 : salariot2; //aqui se aplica el operador ternario
		
		System.out.println("El salario mayor es: " + salario_mayor);

	}

}

import java.util.Scanner;

public class ConcatenacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 1850.55;
		
		double salarioEnDolares = salario * 1.2;
		
		System.out.println("El salario de Samir es : " + (salarioEnDolares + 300)+ " a dia de hoy");

		Scanner entrada = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Introduce tu edad, por favor: ");
		
		edad = entrada.nextInt();
		
		System.out.println("La edad introducidad es: " + edad);
				
	}
	

}

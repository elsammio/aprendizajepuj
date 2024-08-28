import java.util.Scanner;
public class Uso_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita un numero: ");
		int num = entrada.nextInt();
		System.out.println(Math.sqrt(num));
		
		int resultado = (int) Math.round(3.4);
		
		System.out.println(resultado);

	}

}

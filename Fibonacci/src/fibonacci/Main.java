package fibonacci;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Operaciones operacion = new Operaciones();
		
		int numeroIngresado = operacion.recibirNumero();
		
		int numeroFibonacci = operacion.fibonacci(numeroIngresado);
		
		System.out.println(numeroFibonacci);

	}

	

}

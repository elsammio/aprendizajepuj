package co.edu.javerianacali;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");

        while (true) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            }
        }

        scanner.close();

	}

}

package co.edu.javeriana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int contadorLetras = 0;
        int contadorNumeros = 0;
        int contadorEspacios = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (Character.isLetter(caracter)) {
                contadorLetras++;
            } else if (Character.isDigit(caracter)) {
                contadorNumeros++;
            } else if (Character.isWhitespace(caracter)) {
                contadorEspacios++;
            }
        }

        System.out.println("Número de letras: " + contadorLetras);
        System.out.println("Número de números: " + contadorNumeros);
        System.out.println("Número de espacios en blanco: " + contadorEspacios);

        scanner.close();
    }

	

}

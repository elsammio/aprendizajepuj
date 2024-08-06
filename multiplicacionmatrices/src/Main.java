import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("prueba");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la fila de la Matriz 1: ");
        int filas1 = entrada.nextInt();
        System.out.print("Ingrese la columna de la Matriz 1: ");
        int columnas1 = entrada.nextInt();
        int[][] matriz1 = new int[filas1][columnas1];
        System.out.print("Ingrese la fila de la Matriz 2: ");
        int filas2 = entrada.nextInt();
        System.out.print("Ingrese la columna de la Matriz 2: ");
        int columnas2 = entrada.nextInt();
        int[][] matriz2 = new int[filas2][columnas2];
        if (columnas1 == filas2) {
            int i;
            int j;

            for(i = 0; i < filas1; ++i) {
                for(j = 0; j < columnas1; ++j) {
                    matriz1[i][j] = (int)(Math.random() * 10.0);
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            for(i = 0; i < filas2; ++i) {
                for(j = 0; j < columnas2; ++j) {
                    matriz2[i][j] = (int)(Math.random() * 10.0);
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            int[][] matriz3 = new int[matriz1.length][matriz2[0].length];


            for(i = 0; i < matriz1.length; ++i) {
                for(j = 0; j < matriz2[0].length; ++j) {
                    for(int k = 0; k < matriz2.length; ++k) {
                        matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }

            System.out.println("Matriz resultado 3: ");

            for(i = 0; i < matriz3.length; ++i) {
                for(j = 0; j < matriz3[0].length; ++j) {
                    System.out.print(matriz3[i][j] + " ");
                }

                System.out.println();
            }
        } else {
            System.out.println("La matriz no se puede multiplicar");
        }

    }
}
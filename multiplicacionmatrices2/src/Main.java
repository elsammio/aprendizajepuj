public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = new int[][]{{2, 3, 5}, {7, 2, 4}};
        int[][] matriz2 = new int[][]{{1, 6}, {7, 2}, {0, -5}};
        int[][] matriz3 = new int[matriz1.length][matriz2[0].length];

        int i;
        int j;
        for(i = 0; i < matriz1.length; ++i) {
            for(j = 0; j < matriz2[0].length; ++j) {
                for(int k = 0; k < matriz2.length; ++k) {
                    matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz resultado C:");

        for(i = 0; i < matriz3.length; ++i) {
            for(j = 0; j < matriz3[0].length; ++j) {
                System.out.print(matriz3[i][j] + " ");
            }

            System.out.println();
        }
    }
}
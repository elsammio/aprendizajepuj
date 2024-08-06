import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese un número entero (mayor que 0, diferente de 0 y menor que 10000): ");
            num = entrada.nextInt();

            if (num <= 0 || num > 10000) {
                System.out.println("El número ingresado no es válido.");
            }
        } while (num <= 0 || num > 10000);
        entrada.close();
        int divisor = 10;
        int resultado;
        int residuo;
        int[] numbers = new int[5];
        int index = 0;
        int tamanioNumero = 0;

        String[] unidades ={"","primero", "segundo", "tercero", "cuarto", "quinto", "sexto", "septimo", "octavo", "noveno"};

        String[] decenas = {"","decímo", "vigésimo", "trigésimo","cuadragésimo","quincuagésimo","sexagésimo","septuagésimo","octogésimo","nonagésimo"};

        String[] centenas = {"","centésimo", "ducentésimo", "tricentésimo","cuadringentésimo","quingentésimo","sexcentésimo","septingentésimo","octingentésimo","noningentésimo"};

        String[] miles = {"","milésimo", "dosmilésimo", "tresmilésimo","cuatromilésimo","cincomilésimo","seismilésimo","sietemilésimo","octimilésimo","nuevemilésimo"};

        String[] decenasMiles = {"","diezmilesimo"};

        while (num > 0){
            resultado = num / divisor;
            residuo = num % divisor;
            num = resultado;
            numbers[index]= residuo;
            index++;
        }


        for (int i = index - 1; i > -1 ; i--) {
            System.out.println(numbers[i]);
        }
        tamanioNumero = index;

        System.out.println("el tamaño del numero es: " + tamanioNumero);

        if (tamanioNumero == 1) {
            System.out.println(unidades[numbers[0]]);

        }else if (tamanioNumero == 2) {
            System.out.println(decenas[numbers[1]] + " " + unidades[numbers[0]]);

        }else if (tamanioNumero == 3) {
            System.out.println(centenas[numbers[2]] + " " + decenas[numbers[1]] + " " + unidades[numbers[0]]);
        }else if (tamanioNumero == 4) {
            System.out.println(miles[numbers[3]] + " " + centenas[numbers[2]] + " " + decenas[numbers[1]]+ "  " + unidades[numbers[0]]);
        }else if (tamanioNumero == 5) {
            System.out.println(decenasMiles[numbers[4]] + " " + miles[numbers[3]] + " " + centenas[numbers[2]] + " " + decenas[numbers[1]] + " " + unidades[numbers[0]]);
        }
    }
}
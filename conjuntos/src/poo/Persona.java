package poo;
import java.util.Scanner;
public class Persona {
    String nombres;
    int edad;
    String carrera;

    public Persona(){ // constructor
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los nombres de la persona: ");
        nombres = entrada.next();
        System.out.print("Ingrese la edad de la persona: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese la carrera de la persona: ");
        carrera = entrada.next();

    }
    
}


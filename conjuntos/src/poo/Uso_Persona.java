package poo;

public class Uso_Persona {
    public static void main(String[] args) {
        Persona Estudiante = new Persona(); //Instancio la clase
        String [] estudiantes;

        System.out.println("El estudiante " + Estudiante.nombres + " tiene " + Estudiante.edad
        + " años y estudia " + Estudiante.carrera);
    }
}

package conjunto;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Estudiante> sistemas = new ArrayList<>();
		
		List<Estudiante> economia = new ArrayList<>();
		
		List<Estudiante> interseccion = new ArrayList<>();
		
		//Estudiante estudiante = new Estudiante(1, "Samir", "Diaz");
		
		sistemas.add(new Estudiante (1,"Samir", "Diaz"));
		sistemas.add(new Estudiante (2,"Alexander", "Filigrana"));
		sistemas.add(new Estudiante (3,"Monica", "Perdomo"));
		sistemas.add(new Estudiante (5,"Andres", "Gutierrez"));
		
		economia.add(new Estudiante (4,"Alexander", "Alegria"));
		economia.add(new Estudiante (5,"Andres", "Gutierrez"));
		economia.add(new Estudiante (1,"Samir", "Diaz"));
		economia.add(new Estudiante (2,"Alexander", "Filigrana"));
		
		
		
		
		
		
	}

}

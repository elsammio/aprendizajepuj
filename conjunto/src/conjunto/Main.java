package conjunto;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Estudiante> sistemas = new ArrayList<>();
		
		List<Estudiante> economia = new ArrayList<>();
		
		List<Estudiante> ingles = new ArrayList<>();
		
		List<Estudiante> universal = new ArrayList<>();
		
		
		
		Conjunto conjunto = new Conjunto();
		
		
		
		//List<Estudiante> interseccion = new ArrayList<>();
		
		
		sistemas.add(new Estudiante (1,"Samir", "Diaz"));
		sistemas.add(new Estudiante (2,"Alexander", "Filigrana"));
		sistemas.add(new Estudiante (3,"Monica", "Perdomo"));
		sistemas.add(new Estudiante (5,"Andres", "Gutierrez"));
		
		economia.add(new Estudiante (4,"Alexander", "Alegria"));
		economia.add(new Estudiante (5,"Andres", "Gutierrez"));
		economia.add(new Estudiante (1,"Samir", "Diaz"));
		economia.add(new Estudiante (2,"Alexander", "Filigrana"));
		
		ingles.add(new Estudiante (10,"Gina", "Villafae"));
		ingles.add(new Estudiante (11,"Selene", "Osorio"));
		ingles.add(new Estudiante (12,"Yisel", "Cruz"));
		ingles.add(new Estudiante (13,"Diana", "Luna"));
		
		
		
		
		//System.out.println(conjunto.interseccion(sistemas, economia));
		
		List<Estudiante> diferencia = conjunto.diferencia(sistemas, economia);
		
		conjunto.impresionConjuntos(diferencia);
		
		

		
		
	}

}
;
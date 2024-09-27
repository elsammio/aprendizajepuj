package conjunto;
import java.util.ArrayList;
import java.util.List;

public class Conjunto {
	
	public List<Estudiante> interseccion(List<Estudiante> conjunto1, List<Estudiante> conjunto2) {
		
		List<Estudiante> interseccion = new ArrayList<>();
		
		for(Estudiante estudianteSistemas : conjunto1){
			for(Estudiante estudianteEconomia : conjunto2){
				
				if(estudianteSistemas.getIdEstudiante() == estudianteEconomia.getIdEstudiante()) {
					
					interseccion.add(new Estudiante(estudianteSistemas.getIdEstudiante(),estudianteSistemas.getNombres(),estudianteSistemas.getApellidos()));
					
					System.out.println(interseccion);
					
				}
				
			}
		}
		
		return interseccion;
		
	}
	
	public List<Estudiante> union(List<Estudiante> conjunto1, List<Estudiante> conjunto2){
		List<Estudiante> union = new ArrayList<>();
		
		
		return union;
	}
	
	public List<Estudiante> diferencia(List<Estudiante> conjunto1, List<Estudiante> conjunto2){
		List<Estudiante> diferencia = new ArrayList<>();
		
		
		return diferencia;
	}
	
	
	
}

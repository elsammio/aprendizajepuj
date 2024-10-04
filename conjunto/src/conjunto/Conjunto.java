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
		
		boolean elementoNoPresenteEnConjunto1 = true;
		
		for(Estudiante elementoConjunto1 : conjunto1){
			for(Estudiante elementoConjunto2 : conjunto2){
				
				if(elementoConjunto1.getIdEstudiante() == elementoConjunto2.getIdEstudiante()) {
					
					elementoNoPresenteEnConjunto1 = false;
					
					break;
						
				}
						
			}
			
			if (elementoNoPresenteEnConjunto1) {
				
				diferencia.add(new Estudiante(elementoConjunto1.getIdEstudiante(),elementoConjunto1.getNombres(),elementoConjunto1.getApellidos()));
				
			
			}
			
			elementoNoPresenteEnConjunto1 = true;
					
			
		}
	
		
		return diferencia;
	}
	
	
	public void impresionConjuntos(List<Estudiante> conjunto) {
		
		for(Estudiante estudiante: conjunto) {
			
			System.out.println(estudiante.getIdEstudiante());
		}
	
	}
	
	
	
	
}

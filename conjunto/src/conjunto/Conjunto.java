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
		union.addAll(conjunto1);// agrego aqui todos los elementos del conjunto 1
		
		for (Estudiante elementoConjunto2 : conjunto2) {
			
            if (!union.contains(elementoConjunto2)) {// Aqui comparo si los elementos de conjunto dos estan en union
                union.add(elementoConjunto2);
            }
        }
		
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
	
	public List<Estudiante> complemento(List<Estudiante> conjunto1, List<Estudiante> conjunto2){
		
		return diferencia(conjunto1, conjunto2);
	}
	
	
	public void impresionConjuntos(List<Estudiante> conjunto) {
		
		for(Estudiante estudiante: conjunto) {
			
			System.out.println(estudiante.getIdEstudiante());
		}
	
	}
	
	
	
	
}

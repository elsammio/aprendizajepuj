package conjunto;
import java.util.ArrayList;
import java.util.List;

public class Conjunto {
	
	
	/*for(int i=0; i < sistemas.size(); i ++) {
	
	for(int j = 0; j< economia.size(); j ++) {
		
		if(sistemas.get(i).getIdEstudiante()== economia.get(j).getIdEstudiante()) {
			
			interseccion.add(new Estudiante (sistemas.get(i).getIdEstudiante(),sistemas.get(i).getNombres(), sistemas.get(i).getApellidos()));
			
			System.out.println(interseccion);
			
		}
		
	}			
	
}*/
	
	for(Estudiante estudianteSistemas : sistemas){
		for(Estudiante estudianteEconomia : economia) {
			
			if(estudianteSistemas.getIdEstudiante() == estudianteEconomia.getIdEstudiante()) {
				
				interseccion.add(new Estudiante(estudianteSistemas.getIdEstudiante(),estudianteSistemas.getNombres(),estudianteSistemas.getApellidos()));
				
				System.out.println(interseccion);
				
			}
			
		}
	}

}

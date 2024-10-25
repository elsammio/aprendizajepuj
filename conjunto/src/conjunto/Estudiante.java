package conjunto;

import java.util.Objects;

public class Estudiante { 
	private int idEstudiante;
	private String nombres;
	private String apellidos;
	
	public Estudiante(int idEstudiante, String nombres, String apellidos) {//contructor
		super();
		this.idEstudiante = idEstudiante;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, idEstudiante, nombres);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(apellidos, other.apellidos) && idEstudiante == other.idEstudiante
				&& Objects.equals(nombres, other.nombres);
	}

	
	
	
	
	
	
	
}

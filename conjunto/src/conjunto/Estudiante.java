package conjunto;

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
	
	
	
	
	
}

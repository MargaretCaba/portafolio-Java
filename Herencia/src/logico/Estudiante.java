package logico;

public class Estudiante extends Persona {
	private String matricula;
	private String carrera;
	private String facultad;
	
	public Estudiante(String nombre, String nI, String matricula, String carrera, String facultad) {
		super(nombre, nI);
		this.matricula = matricula;
		this.carrera = carrera;
		this.facultad = facultad;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
}

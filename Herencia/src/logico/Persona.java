package logico;

public class Persona {
	protected String nombre;
	protected String NI;
	
	public Persona(String nombre, String nI) {
		super();
		this.nombre = nombre;
		this.NI = nI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNI() {
		return NI;
	}

	public void setNI(String nI) {
		this.NI = nI;
	}
	
}

package logico;

public class Maestro extends Trabajador {
	private String categoria;
	
	public Maestro(String nombre, String nI, String dep, float salario, String categoria) {
		super(nombre, nI, dep, salario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

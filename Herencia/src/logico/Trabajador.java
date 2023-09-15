package logico;

public class Trabajador extends Persona {
	private String dep;
	protected float salario;
	
	public Trabajador(String nombre, String nI, String dep, float salario) {
		super(nombre, nI);
		this.dep = dep;
		this.salario = salario;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}

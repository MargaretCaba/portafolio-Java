package logico;

public class Reparadores {
	protected String cedula;
	protected String nombre;
	protected double salarioBase;
	protected double antiguedad;
	
	public Reparadores(String cedula, String nombre, double salarioBase, double antiguedad) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.antiguedad = antiguedad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(double antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
}

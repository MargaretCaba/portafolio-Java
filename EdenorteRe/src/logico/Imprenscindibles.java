package logico;

public class Imprenscindibles extends Reparadores {
	private double incrementoSalario = 0;

	public Imprenscindibles(String cedula, String nombre, double salarioBase, double antiguedad,
			double incrementoSalario) {
		super(cedula, nombre, salarioBase, antiguedad);
		this.incrementoSalario = incrementoSalario;
	}

	public double getIncrementoSalario() {
		return incrementoSalario;
	}

	public void setIncrementoSalario(double incrementoSalario) {
		this.incrementoSalario = incrementoSalario;
	}
	
}

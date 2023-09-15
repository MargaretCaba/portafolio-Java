package logico;

public class Riesgo extends Reparadores {
	private int condiRiesgo = 0;
	
	public Riesgo(String cedula, String nombre, double salarioBase, double antiguedad, int condiRiesgo) {
		super(cedula, nombre, salarioBase, antiguedad);
		this.condiRiesgo = condiRiesgo;
	}
	

	public int getCondiRiesgo() {
		return condiRiesgo;
	}

	public void setCondiRiesgo(int condiRiesgo) {
		this.condiRiesgo = condiRiesgo;
	}

	
}

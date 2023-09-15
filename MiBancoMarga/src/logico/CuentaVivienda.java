package logico;

import java.util.Date;

public class CuentaVivienda extends Cuentas {
	private double interes;

	public CuentaVivienda(String codigo, Date fechaApertura, int diaCorteMes, String estado, double saldo, int puntos,
			double interes) {
		super(codigo, fechaApertura, diaCorteMes, estado, saldo, puntos);
		this.interes = interes;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
}

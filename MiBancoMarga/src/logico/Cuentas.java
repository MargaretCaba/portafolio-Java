// Margaret Quezada Caba 10152069

package logico;

import java.util.Date;

public class Cuentas {
	protected String codigo;
	protected Date fechaApertura;
	protected int diaCorteMes;
	protected String estado;
	protected double saldo;
	protected int puntos;
	
	public Cuentas(String codigo, Date fechaApertura, int diaCorteMes, String estado, double saldo, int puntos) {
		super();
		this.codigo = codigo;
		this.fechaApertura = fechaApertura;
		this.diaCorteMes = diaCorteMes;
		this.estado = estado;
		this.saldo = saldo;
		this.puntos = puntos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getDiaCorteMes() {
		return diaCorteMes;
	}

	public void setDiaCorteMes(int diaCorteMes) {
		this.diaCorteMes = diaCorteMes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
}

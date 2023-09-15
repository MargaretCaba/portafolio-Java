// Margaret Quezada 10152069

package logico;

import java.util.ArrayList;

public class Clientes {
	private ArrayList<Cuentas> misCuentas;
	private String nombre;
	private String cedula;
	private String direccion;
	private int cel;
	
	public Clientes(ArrayList<Cuentas> misCuentas, String nombre, String cedula, String direccion, int cel) {
		super();
		this.misCuentas = misCuentas;
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.cel = cel;
	}

	public ArrayList<Cuentas> getMisCuentas() {
		return misCuentas;
	}

	public void setMisCuentas(ArrayList<Cuentas> misCuentas) {
		this.misCuentas = misCuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}
	
	// metodos
	
	public double revisarCuentas() {
		double totalSaldo = 0;
		
		for (Cuentas cuenta : misCuentas) {
			double interes = 0;
			
			if (cuenta instanceof CuentaCorriente) {
				CuentaCorriente cc = (CuentaCorriente) cuenta;
				interes = cc.getInteres();
			}else if (cuenta instanceof CuentaVivienda) {
				CuentaVivienda cv = (CuentaVivienda) cuenta;
				interes = cv.getInteres();
			}else if (cuenta instanceof FondoInversion) {
				FondoInversion fi = (FondoInversion) cuenta;
				interes = fi.getInteres();
			}
			cuenta.setSaldo(cuenta.getSaldo() + interes - 0.6);
			totalSaldo += cuenta.getSaldo();
		}
		return totalSaldo;
	}
	
	public boolean retirarDinero (String cuCodigo, double monto) {
		for (Cuentas cuenta : misCuentas) {
			if (cuenta.getCodigo() == cuCodigo) {
				if (cuenta instanceof CuentaCorriente) {
					CuentaCorriente cc = (CuentaCorriente)cuenta;
					if(monto <= cc.getSaldo()) {
						cc.setSaldo(cc.getSaldo() - monto);
						return true;
					}else {
						return false;
					}
				}else if (cuenta instanceof FondoInversion) {
					FondoInversion fi = (FondoInversion)cuenta;
					if (monto <= 500) {
						if (monto <= fi.getSaldo()) {
							fi.setSaldo(fi.getSaldo() - monto);
							return true;
						}else {
							fi.setEstado("Bloqueada");
							return false;
						}
					}else {
						return false;
					}
				}else {
					return false;
				}
			}
		}
		return false;
	}
	

    public void ingresarSaldo(String cuCodigo, double monto) {
        for (Cuentas cuenta : misCuentas) {
            if (cuenta.getCodigo() == cuCodigo) {
                cuenta.setSaldo(cuenta.getSaldo() + monto);
                int puntos = (int) (cuenta.getSaldo() / 6);
                cuenta.setPuntos(puntos);
                return;
            }
        }
    }
    
    public int obtenerPuntosAcumulados() {
        int totalPuntos = 0;
        for (Cuentas cuenta : misCuentas) {
            totalPuntos += cuenta.getPuntos();
        }
        return totalPuntos;
    }
	
}

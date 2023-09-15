package logico;

import java.util.ArrayList;

public class Popular {
	private ArrayList<Clientes> misClientes;
	private ArrayList<Cuentas> lasCuentas;
	public Popular(ArrayList<Clientes> misClientes, ArrayList<Cuentas> lasCuentas) {
		super();
		this.misClientes = misClientes;
		this.lasCuentas = lasCuentas;
	}
	public ArrayList<Clientes> getMisClientes() {
		return misClientes;
	}
	public void setMisClientes(ArrayList<Clientes> misClientes) {
		this.misClientes = misClientes;
	}
	public ArrayList<Cuentas> getLasCuentas() {
		return lasCuentas;
	}
	public void setLasCuentas(ArrayList<Cuentas> lasCuentas) {
		this.lasCuentas = lasCuentas;
	}
	
	
}

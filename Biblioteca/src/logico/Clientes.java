package logico;

import java.util.ArrayList;

public class Clientes {
	private ArrayList<Prestamos> misPrestamos;
	private String idUser;
	private String direccion;
	private String nombre;
	private int cantPrestamos;
	
	public Clientes(ArrayList<Prestamos> misPrestamos, String idUser, String direccion, String nombre,
			int cantPrestamos) {
		super();
		this.misPrestamos = new ArrayList<Prestamos>();
		this.idUser = idUser;
		this.direccion = direccion;
		this.nombre = nombre;
		this.cantPrestamos = cantPrestamos;
	}

	public ArrayList<Prestamos> getMisPrestamos() {
		return misPrestamos;
	}

	public void setMisPrestamos(ArrayList<Prestamos> misPrestamos) {
		this.misPrestamos = misPrestamos;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantPrestamos() {
		return cantPrestamos;
	}

	public void setCantPrestamos(int cantPrestamos) {
		this.cantPrestamos = cantPrestamos;
	}
	
	
}

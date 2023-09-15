package logico;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Clientes> losClientes;
	private ArrayList<Prestamos> losPrestamos;
	private ArrayList<Publicacion> lasPublicaciones;
	
	public Biblioteca(ArrayList<Clientes> losClientes, ArrayList<Prestamos> losPrestamos,
			ArrayList<Publicacion> lasPublicaciones) {
		super();
		this.losClientes = new  ArrayList<Clientes>();
		this.losPrestamos = new ArrayList<Prestamos>();
		this.lasPublicaciones = new ArrayList<Publicacion>();
	}

	public ArrayList<Clientes> getLosClientes() {
		return losClientes;
	}

	public void setLosClientes(ArrayList<Clientes> losClientes) {
		this.losClientes = losClientes;
	}

	public ArrayList<Prestamos> getLosPrestamos() {
		return losPrestamos;
	}

	public void setLosPrestamos(ArrayList<Prestamos> losPrestamos) {
		this.losPrestamos = losPrestamos;
	}

	public ArrayList<Publicacion> getLasPublicaciones() {
		return lasPublicaciones;
	}

	public void setLasPublicaciones(ArrayList<Publicacion> lasPublicaciones) {
		this.lasPublicaciones = lasPublicaciones;
	}
	
	public void insertarPublic(Publicacion aux) {
		lasPublicaciones.add(aux);
	}
	
	public String findTituloById (String idPublic) {
		String titulo = "";
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<lasPublicaciones.size()) {
			if(lasPublicaciones.get(i).getIdPublic().equalsIgnoreCase(idPublic)) {
				titulo=lasPublicaciones.get(i).getTitulo();
				encontrado=true;
			}
			i++;
		}
		return titulo;
	}
}

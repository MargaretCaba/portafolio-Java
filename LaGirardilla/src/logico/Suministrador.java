package logico;

public class Suministrador {
	private String id;
	//private int cosecha; 
	private String nombre;
	private String pais;
	private int tiempoEntrega;

	public Suministrador(String id, String nombre, String pais, int tiempoEntrega) {
		super();
		this.id = id;
		//this.cosecha = cosecha;
		this.nombre = nombre;
		this.pais = pais;
		this.tiempoEntrega = tiempoEntrega;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	//}
	//public int getCosecha() {
	//	return cosecha;
	//}
	//public void setCosecha(int cosecha) {
	//	this.cosecha = cosecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getTiempoEntrega() {
		return tiempoEntrega;
	}
	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

}

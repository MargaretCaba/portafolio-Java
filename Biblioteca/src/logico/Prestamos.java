package logico;

import java.util.Date;

public class Prestamos {
	private String id;
	private Publicacion publica;
	private Clientes clientes;
	private String fechaEntrega;
	private Date fechaInicio;
	private boolean prorrogado;
	private boolean estado;
	
	public Prestamos(String id, Publicacion publica, Clientes clientes, String fechaEntrega, String fechaInicio,
			boolean prorrogado, boolean estado) {
		super();
		this.id = id;
		this.publica = publica;
		this.clientes = clientes;
		this.fechaEntrega = fechaEntrega;
		this.fechaInicio = new Date();
		this.prorrogado = false;
		this.estado = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Publicacion getPublica() {
		return publica;
	}

	public void setPublica(Publicacion publica) {
		this.publica = publica;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public boolean isProrrogado() {
		return prorrogado;
	}

	public void setProrrogado(boolean prorrogado) {
		this.prorrogado = prorrogado;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}

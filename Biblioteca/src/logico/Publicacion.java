package logico;

public class Publicacion {
	protected String idPublic;
	protected String titulo;
	protected String materia;
	protected int cantEjemplares;
	protected boolean estado;
	
	public Publicacion(String idPublic, String titulo, String materia, int cantEjemplares, boolean estado) {
		super();
		this.idPublic = idPublic;
		this.titulo = titulo;
		this.materia = materia;
		this.cantEjemplares = cantEjemplares;
		this.estado = estado;
	}

	public String getIdPublic() {
		return idPublic;
	}

	public void setIdPublic(String idPublic) {
		this.idPublic = idPublic;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCantEjemplares() {
		return cantEjemplares;
	}

	public void setCantEjemplares(int cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}

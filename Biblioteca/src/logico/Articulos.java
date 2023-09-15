package logico;

public class Articulos extends Publicacion {
	private String autor;
	private String arbitro;
	
	public Articulos(String idPublic, String titulo, String materia, int cantEjemplares, boolean estado, String autor,
			String arbitro) {
		super(idPublic, titulo, materia, cantEjemplares, estado);
		this.autor = autor;
		this.arbitro = arbitro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}
	
	
}

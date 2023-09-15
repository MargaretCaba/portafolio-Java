package logico;

public class Libros extends Publicacion {
	private String autor;
	private String editorial;
	
	public Libros(String idPublic, String titulo, String materia, int cantEjemplares, boolean estado, String autor,
			String editorial) {
		super(idPublic, titulo, materia, cantEjemplares, estado);
		this.autor = autor;
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
}

package logico;

public class Revistas extends Publicacion {
	private int anno;
	private String numRevista;
	
	public Revistas(String idPublic, String titulo, String materia, int cantEjemplares, boolean estado, int anno,
			String numRevista) {
		super(idPublic, titulo, materia, cantEjemplares, estado);
		this.anno = anno;
		this.numRevista = numRevista;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(String numRevista) {
		this.numRevista = numRevista;
	}
	
	
}

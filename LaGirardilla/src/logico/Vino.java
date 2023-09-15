package logico;

public class Vino {
	private String id;
	private String nombre;
	private int cosecha; 
	private String tipoVino;
	private int disMax; 
	private int disMin; 
	private int disReal;
	private int []venta;
	private Suministrador miSumi;
	
	public Vino(String id, String nombre, int cosecha, String tipoVino, int disMax, int disMin,
			int disReal, Suministrador miSumi) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cosecha = cosecha;
		this.tipoVino = tipoVino;
		this.disMax = disMax;
		this.disMin = disMin;
		this.disReal = disReal;
		this.miSumi = miSumi;
		this.venta = new int[10];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCosecha() {
		return cosecha;
	}

	public void setCosecha(int cosecha) {
		this.cosecha = cosecha;
	}

	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public int getDisMax() {
		return disMax;
	}

	public void setDisMax(int disMax) {
		this.disMax = disMax;
	}

	public int getDisMin() {
		return disMin;
	}

	public void setDisMin(int disMin) {
		this.disMin = disMin;
	}

	public int getDisReal() {
		return disReal;
	}

	public void setDisReal(int disReal) {
		this.disReal = disReal;
	}

	public int[] getVenta() {
		return venta;
	}

	public void setVenta(int[] venta) {
		this.venta = venta;
	}

	public Suministrador getMiSumi() {
		return miSumi;
	}

	public void setMiSumi(Suministrador miSumi) {
		this.miSumi = miSumi;
	}
	
	public boolean promedioDeVentas(){
		boolean promedio = false;
		int suma=0;
		for (int i=6; i<=8; i++) {
			suma+=venta[i];
		}
		if (venta[9]>suma/3){
			promedio=true;
		}
		return promedio;
	}
	
}

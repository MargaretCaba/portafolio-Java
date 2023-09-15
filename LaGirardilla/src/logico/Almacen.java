package logico;

public class Almacen {
	private String id;
	private Vino[] misVinos;
	private Suministrador[] misSumi; 
	private static int cantVinos;
	private static int cantSumi;
	private static int generadorCodiVino=1;
	private static int generadorCodiSumi=1;
	private static Almacen alma = null;
	
	Almacen(){
		super();
		cantVinos = 0;
		cantSumi = 0;
		misVinos = new Vino[50];
		misSumi = new Suministrador[50];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vino[] getMisVinos() {
		return misVinos;
	}

	public void setMisVinos(Vino[] misVinos) {
		this.misVinos = misVinos;
	}

	public Suministrador[] getMisSumi() {
		return misSumi;
	}

	public void setMisSumi(Suministrador[] misSumi) {
		this.misSumi = misSumi;
	}

	public static int getCantVinos() {
		return cantVinos;
	}

	public static void setCantVinos(int cantVinos) {
		Almacen.cantVinos = cantVinos;
	}

	public static int getCantSumi() {
		return cantSumi;
	}

	public static void setCantSumi(int cantSumi) {
		Almacen.cantSumi = cantSumi;
	}

	public static int getGeneradorCodiVino() {
		return generadorCodiVino;
	}

	public static void setGeneradorCodiVino(int generadorCodiVino) {
		Almacen.generadorCodiVino = generadorCodiVino;
	}

	public static int getGeneradorCodiSumi() {
		return generadorCodiSumi;
	}

	public static void setGeneradorCodiSumi(int generadorCodiSumi) {
		Almacen.generadorCodiSumi = generadorCodiSumi;
	}
	
	public void insertarVino(Vino vino){
		misVinos[cantVinos]=vino;
		cantVinos++;
		generadorCodiVino++;
		}
	
	public void inseetarSumi(Suministrador sumi) {
		misSumi[cantSumi]=sumi;
		cantSumi++;
		generadorCodiSumi++;
	}
	
	public Vino buscarVino(String idVino) {
		Vino aux = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<cantVinos) {
			if(misVinos[i].getId().equalsIgnoreCase(idVino)) {
				aux=misVinos[i];
				encontrado=true;
			}
			i++;
		}
		return aux;
	}
	
	public Suministrador buscarSumi(String idSumi) {
		Suministrador aux = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<cantSumi) {
			if(misSumi[i].getId().equalsIgnoreCase(idSumi)) {
				aux=misSumi[i];
				encontrado=true;
			}
			i++;
		}
		return aux;
	}
	public static Almacen getInstacia() {
		if(alma == null);
		alma = new Almacen();
		return alma;
	}
	
}

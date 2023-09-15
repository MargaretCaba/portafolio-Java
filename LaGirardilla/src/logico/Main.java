package logico;

public class Main {

	public static void main(String[] args) {			
			Almacen Alm = new Almacen();
			Suministrador S1 = new Suministrador("S-1", "Carlos", "EEUU", 45);
			Vino V1 = new Vino("V-1", "Carlos Rosi", 2015, "Tinto", 400, 20, 50, S1);
			Vino V2 = new Vino("V-2", "La Fuerza", 2009, "Tinto", 400, 50, 20, S1);
			int[] ventas = new int[10];
			for (int i =0; i< 10; i++) 
			{
				ventas[i]=(i+1)*10;
			}
			V1.setVenta(ventas);
		}

	}



package logico;

public class Principal {

	public static void main(String[] args) {
		Cilindro c1 = new Cilindro(5, 5);
		CilindroHueco ch1 = new CilindroHueco(5, 5, 3);
		System.out.println(ch1.volumen());
	}

}
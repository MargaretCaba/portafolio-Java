package logico;

public class Cilindro {
	private float altura;
	protected float radio;
	
	public Cilindro(float altura, float radio) {
		super();
		this.altura = altura;
		this.radio = radio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public float volumen() {
		return (float) areaBase() * altura;
	}

	public double areaBase() {		
		return(Math.PI*Math.pow(radio,2));
	}
	
	
}

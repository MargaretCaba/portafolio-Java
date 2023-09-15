package logico;

public class CilindroHueco extends Cilindro {
	private float radioInterno;

	public CilindroHueco(float altura, float radio, float radioInterno) {
		super(altura, radio);
		this.radioInterno = radioInterno;
	}

	public float getRadioInterno() {
		return radioInterno;
	}

	public void setRadioInterno(float radioInterno) {
		this.radioInterno = radioInterno;
	}
	
	public double areaBase() {		
		return(Math.PI*Math.pow(radio-radioInterno,2));
	}
}

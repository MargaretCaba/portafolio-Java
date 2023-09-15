package logico;

import java.util.ArrayList;

public class Universidad {
	private ArrayList<Persona> mispersonas;

	public Universidad() {
		super();
		mispersonas = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getMispersonas() {
		return mispersonas;
	}

	public void setMispersonas(ArrayList<Persona> mispersonas) {
		this.mispersonas = mispersonas;
	}
	
	public void insertaPersona(Persona persona) {
		mispersonas.add(persona);
	}
	public Persona findeByNI(String NI) {
		Persona aux = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<mispersonas.size()) {
			if(mispersonas.get(i).getNI().equalsIgnoreCase(NI)) {
				aux=mispersonas.get(i);
				encontrado=true;
			}
			i++;
		}
		return aux;
	}
	public float totalSalarioTrabaja() {
		float total =0;
		for (Persona persona : mispersonas) {
		if(persona instanceof Trabajador) {
			total += ((Trabajador)persona).getSalario();
			}	
		}
		return total;
	}
	
}
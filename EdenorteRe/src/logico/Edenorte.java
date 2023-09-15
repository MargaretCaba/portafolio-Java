package logico;

import java.util.ArrayList;

public class Edenorte {
	private ArrayList<Reparadores> losReparadores;

	public Edenorte(ArrayList<Reparadores> losReparadores) {
		super();
		this.losReparadores = new ArrayList <Reparadores>();
	}

	public ArrayList<Reparadores> getLosReparadores() {
		return losReparadores;
	}

	public void setLosReparadores(ArrayList<Reparadores> losReparadores) {
		this.losReparadores = losReparadores;
	}
	
	public void agregarReparador(Reparadores reparador){
		losReparadores.add(reparador);
	}
	
	public ArrayList<Reparadores> obtenerNomina(){
		return losReparadores;
	}
	
	public double salarioDelMes(Reparadores losReparadores, int diasTrabajados) {
		double salario = losReparadores.getSalarioBase() * (0.2 * diasTrabajados) * (1.0 / 3.0 * losReparadores.getAntiguedad());
		
		if (losReparadores instanceof Riesgo) {
			Riesgo reparadorRiesgo = (Riesgo) losReparadores;
			salario += reparadorRiesgo.getAntiguedad()* 3800;
		} else if (losReparadores instanceof Imprenscindibles) {
			Imprenscindibles reparadorImprenscindibles = (Imprenscindibles)losReparadores;
			salario += reparadorImprenscindibles.getIncrementoSalario();
		}
		return salario;
	}
	
	public ArrayList<Reparadores> obtenerLosImprenscindiblesImportantes(){
		ArrayList<Reparadores> imprenscindibles = new ArrayList<>();
		
		double salarioMax = Double.MIN_VALUE;
		for (Reparadores losReparadores : losReparadores) {
			if (losReparadores instanceof Imprenscindibles) {
				int diasTrabajados = 0;
				double salario = salarioDelMes(losReparadores, diasTrabajados);
				if (salario > salarioMax) {
					salarioMax = salario;
					imprenscindibles.clear();
					imprenscindibles.add(losReparadores);
				}else if (salario == salarioMax) {
					imprenscindibles.add(losReparadores);
				}
			}
		}
		
		return imprenscindibles;
	}
	public int obtenerLosRiesgoSalarioMenor(double val) {
		int contador = 0;
		for (Reparadores losReparadores : losReparadores) {
			if (losReparadores instanceof Riesgo) {
				int diasTrabajados = 0;
				double salario = salarioDelMes(losReparadores, diasTrabajados );
				if (salario < val) {
					contador++;
				}
			}
		}
		return contador;
	}
	public double calcularIcrementoSalarios() {
		double gastos = 0;
		for (Reparadores losReparadores : losReparadores) {
			if (losReparadores instanceof Riesgo) {
				Riesgo reparadorRiesgo = (Riesgo)losReparadores;
				gastos += reparadorRiesgo.getAntiguedad()* 3800;
			} else if (losReparadores instanceof Imprenscindibles) {
				Imprenscindibles reparadorImprenscindibles = (Imprenscindibles)losReparadores;
				gastos += reparadorImprenscindibles.getIncrementoSalario();
		}
	}
		return gastos;
}

	
}

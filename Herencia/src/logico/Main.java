package logico;

public class Main {

	public static void main(String[] args) {
		Universidad uni = new Universidad();
		Estudiante estu = new Estudiante("Margaret", "40209", "10152069", "CSI", "Sistema");
		Maestro profe = new Maestro("Marta", "45023", "Tele", 500000, "Instructura");
		
		uni.insertaPersona(estu);
		uni.insertaPersona(profe);
		
		System.out.println(uni.totalSalarioTrabaja());
	}
}

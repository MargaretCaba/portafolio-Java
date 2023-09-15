package logico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear trabajadores
        Reparadores reparador1 = new Riesgo("2324213113", "Peniel", 1000, 5, 4);
        Reparadores reparador2 = new Riesgo("987654321", "Mayeline", 1500, 3, 2);
        Reparadores reparador3 = new Imprenscindibles("567890123", "Ana", 2000, 6, 500);

        // Crear nómina
        Edenorte nomina = new Edenorte(null);
        nomina.agregarReparador(reparador1);
        nomina.agregarReparador(reparador2);
        nomina.agregarReparador(reparador3);

        // Calcular salario de cada trabajador
        double salarioTrabajador1 = nomina.salarioDelMes(reparador1, 20);
        double salarioTrabajador2 = nomina.salarioDelMes(reparador2, 15);
        double salarioTrabajador3 = nomina.salarioDelMes(reparador3, 18);

        System.out.println("Salario de trabajador 1: " + salarioTrabajador1);
        System.out.println("Salario de trabajador 2: " + salarioTrabajador2);
        System.out.println("Salario de trabajador 3: " + salarioTrabajador3);

        // Obtener los trabajadores imprescindibles más importantes
        ArrayList<Reparadores> imprescindibles = nomina.obtenerLosImprenscindiblesImportantes();
        System.out.println("Trabajadores imprescindibles más importantes:");
        for (Reparadores imprescindible : imprescindibles) {
            System.out.println(imprescindible.getNombre());
        }

        // Contar los trabajadores de riesgo que ganan menos de 2000
        int contador = nomina.obtenerLosRiesgoSalarioMenor(2000);
        System.out.println("Cantidad de trabajadores de riesgo con salario menor a 2000: " + contador);
        // Calcular los gastos de incremento salarial de la empresa
        double gastosIncrementoSalarios = nomina.calcularIcrementoSalarios();
        System.out.println("Gastos de incremento salarial de la empresa: " + gastosIncrementoSalarios);
    }
}

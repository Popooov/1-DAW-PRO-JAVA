package actividad2;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {

    static double[] recogerSueldos() {
        double sueldosEmpleados[] = new double[0];

        System.out.println("Encuestas para conocer el nivel adquisitivo de los empleados de Apple");
        Scanner sc = new Scanner(System.in);
        System.out.println("Para finalizar la entrada de datos introduce -1.");

        double sueldo;

        do {
            System.out.print("Introduce un sueldo: ");
            sueldo = sc.nextDouble();

            if (sueldo < 0 && sueldo != -1) {
                while (sueldo < 0) {
                    System.out.println("No se puede introducir un sueldo negativo");
                    System.out.print("Introduce un sueldo mayor que 0: ");
                    sueldo = sc.nextDouble();
                }
            }

            if (sueldo != -1) {
                sueldosEmpleados = Arrays.copyOf(sueldosEmpleados, sueldosEmpleados.length + 1);
                sueldosEmpleados[sueldosEmpleados.length - 1] = sueldo;
            }

        } while (sueldo != -1);

        return sueldosEmpleados;
    }

    static double[] ordenarDecreciente() {
        double sueldosEmpleados[] = recogerSueldos();
        Arrays.sort(sueldosEmpleados);

        double sueldosOrdenadosDecreciente[] = new double[sueldosEmpleados.length];
        int contador = 0;
        for (int i = sueldosEmpleados.length - 1; i >= 0; i--) {
            sueldosOrdenadosDecreciente[contador] = sueldosEmpleados[i];
            contador++;
        }
        System.out.print("Los sueldos introducidos ordenados de forma decreciente: ");
        System.out.println(Arrays.toString(sueldosOrdenadosDecreciente));
        return sueldosOrdenadosDecreciente;
    }

    static double[] encontrarSueldoMaximoYMinimo(double sueldosOrdenadosDecreciente[]) {
        double sueldosMaximoYMinimo[] = new double[2];
        double sueldoMaximo = 0;

        for (int i = 0; i < sueldosOrdenadosDecreciente.length; i++) {
            if (sueldoMaximo < sueldosOrdenadosDecreciente[i]) {
                sueldoMaximo = sueldosOrdenadosDecreciente[i];
                sueldosMaximoYMinimo[0] = sueldoMaximo;
            }
        }

        double sueldoMinimo = sueldoMaximo;
        for (int i = 0; i < sueldosOrdenadosDecreciente.length; i++) {
            if (sueldoMinimo > sueldosOrdenadosDecreciente[i]) {
                sueldoMinimo = sueldosOrdenadosDecreciente[i];
                sueldosMaximoYMinimo[1] = sueldoMinimo;
            }
        }

        System.out.println("El sueldo máximo y mínimo: " + Arrays.toString(sueldosMaximoYMinimo));
        encontrarMediaSueldos(sueldosOrdenadosDecreciente);
        return sueldosMaximoYMinimo;
    }

    static void encontrarMediaSueldos(double[] sueldos) {
        double sumaSueldos = 0;
        double mediaSueldos;
        for (double sueldo : sueldos) {
            sumaSueldos += sueldo;
        }

        mediaSueldos = sumaSueldos / sueldos.length;

        System.out.println("La media de los sueldos: " + mediaSueldos);
    }

    public static void main(String[] args) {
        encontrarSueldoMaximoYMinimo(ordenarDecreciente());
    }

}

package parimpar;

import java.util.Arrays;
import java.util.Scanner;

public class ParImpar {
    static int[] almacenarNumeros() {
        Scanner sc = new Scanner(System.in);
        int tabla[] = new int[0];
        int numeroIntroducido;
        
        System.out.println("Para terminar introduce 0");
        
        do {            
            System.out.print("Dame un número par o impar: ");
            numeroIntroducido = sc.nextInt();
            if (numeroIntroducido != 0) {
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = numeroIntroducido;
            }
        } while (numeroIntroducido != 0);
        
        return tabla;
    }
    
    static int[][] crearTablasParYImpar() {
        int tabla[] = almacenarNumeros();
        int tablaNumerosPar[] = new int[0];
        int tablaNumerosImpar[] = new int[0];
        
        for (int i : tabla) {
            if (i % 2 == 0) {
                tablaNumerosPar = Arrays.copyOf(tablaNumerosPar, tablaNumerosPar.length + 1);
                tablaNumerosPar[tablaNumerosPar.length - 1] = i;
            } else {
                tablaNumerosImpar = Arrays.copyOf(tablaNumerosImpar, tablaNumerosImpar.length + 1);
                tablaNumerosImpar[tablaNumerosImpar.length - 1] = i;
            }
        }
        
        int tablas[][] = {tablaNumerosPar,tablaNumerosImpar};
        
        return tablas;
    }
    
    public static void main(String[] args) {
        for (int[] tabla : crearTablasParYImpar()) {
            System.out.println(Arrays.toString(tabla));
        }
    }
    
}

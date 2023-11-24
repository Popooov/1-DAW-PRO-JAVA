package actividad1;

import java.util.Arrays;

public class Actividad1 {
    static double[] sumarColumnas(double matriz[][]) {
        int numeroFilas = matriz.length;
        int numeroColumnas = matriz[0].length;
        double sumaColumnas[] = new double[numeroColumnas];
        
        for (int i = 0; i < numeroColumnas; i++) {
            double suma = 0;
            
            for (int j = 0; j < numeroFilas; j++) {
                suma += matriz[j][i];
                sumaColumnas[i] = suma;
            }
        }
        
        return sumaColumnas;
    }
    
    public static void main(String[] args) {
        double matriz[][] = {
            {2.5, 3, 6.7, 0.6},
            {8, 4.5, 5.4, 3.2},
            {9, 6.2, 1.2, 4.3}
        };
        
        System.out.println(Arrays.toString(sumarColumnas(matriz)));
    }
    
}

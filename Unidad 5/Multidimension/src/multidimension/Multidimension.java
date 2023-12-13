package multidimension;

import java.util.Arrays;


public class Multidimension {


    public static void main(String[] args) {
        // Crear una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma:
        // el elemento de la posición [n][m] debe contener el valor 10 x n + m.
        // Después se debe mostrar su contenido.
        int bidimensional[][] = new int[5][5];
        
        for (int n = 0; n < bidimensional.length; n++) {
            for (int m = 0; m < bidimensional[n].length; m++) {
                bidimensional[n][m] = 10 * n + m;
            }
        }
        
        for (int[] element : bidimensional) {
            System.out.println(Arrays.toString(element));
        }
    }
    
}

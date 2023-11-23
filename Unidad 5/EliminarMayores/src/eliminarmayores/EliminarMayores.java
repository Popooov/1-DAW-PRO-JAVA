package eliminarmayores;

import java.util.Arrays;

public class EliminarMayores {
    static int[] eliminarMayores(int t[], int valor) {
        int copia[] = new int[0];
        
        for (int i : t) {
            if (i <= valor) {
                copia = Arrays.copyOf(copia, copia.length + 1);
                copia[copia.length - 1] = i;
            }
        }
        
        return copia;
    }
    
    public static void main(String[] args) {
        int t[] = {4, 8, 9, 6, 11, -3, -4, 14, 5};
        System.out.println(Arrays.toString(eliminarMayores(t, 8)));
    }
    
}
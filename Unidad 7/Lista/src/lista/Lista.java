package lista;

import java.util.Arrays;


public class Lista {
    private int[] tabla;
    
    public Lista () {
        tabla = new int[0];
    }
    
    void getTabla () {
        System.out.println(tabla.length);
        System.out.println(Arrays.toString(tabla));
    }
    
    void insertarAlFinal (int numero) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = numero;
    }
    
    void insertarAlFinalOtraLista (int[] otraLista) {
        for (int i = 0; i < otraLista.length; i++) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = otraLista[i];
        }
    }
    
    void obtenerElemento (int indice) {
        System.out.println(tabla[indice]);
    }
}

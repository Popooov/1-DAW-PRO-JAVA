package eliminar;

import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    
    static int[] generarTablaNumerosAleatorios() {
        int tablaNumerosAleatorios[] = new int[10];
        
        int i = 0;
        while (i < tablaNumerosAleatorios.length) {            
            int numAleatorio = (int) (Math.random() * 100 + 1);
            boolean numeroRepetido = false;
            
            for (int j = 0; j < i; j++) {
                if (tablaNumerosAleatorios[j] == numAleatorio) {
                    numeroRepetido = true;
                }
            }
            
            if (!numeroRepetido) {
                tablaNumerosAleatorios[i] = numAleatorio;
                i++;
            }
        }
        
        Arrays.sort(tablaNumerosAleatorios);
        return tablaNumerosAleatorios;
    }
    
    static int[] eliminarElemento() {
        int tablaNumerosAleatorios[] = generarTablaNumerosAleatorios();
        System.out.println(Arrays.toString(tablaNumerosAleatorios));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el elemento de la tabla que quieres borrar: ");
        int elementoAEliminar = sc.nextInt();
        
        int indiceAEliminar = -1;
        
        for (int i = 0; i < tablaNumerosAleatorios.length; i++) {
            if (tablaNumerosAleatorios[i] == elementoAEliminar) {
                indiceAEliminar = i;
                break;
            }
        }
        
        if (indiceAEliminar != -1) {
            int[] nuevoArray = new int[tablaNumerosAleatorios.length - 1];
            int nuevoIndice = 0;
            for (int i = 0; i < tablaNumerosAleatorios.length; i++) {
                if (i != indiceAEliminar) {
                    nuevoArray[nuevoIndice++] = tablaNumerosAleatorios[i];
                }
            }

            
            tablaNumerosAleatorios = nuevoArray;
        }
        return tablaNumerosAleatorios;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(eliminarElemento()));
    }
    
}

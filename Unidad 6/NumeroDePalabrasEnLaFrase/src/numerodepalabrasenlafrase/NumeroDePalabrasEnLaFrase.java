package numerodepalabrasenlafrase;

import java.util.Scanner;

public class NumeroDePalabrasEnLaFrase {
    static int buscarPalabras(String frase, String palabra) {
        String palabras[] = frase.split(" ");
        int contador = 0;
        
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        // Diseñar un programa que solicite al usuario una frase y una palabra.
        // A continuación buscará cuántas veces aparece la palabra en la frase.
        String frase, palabra;
        int cantidadPalabrasEncontradas;
        
        Scanner sc = new Scanner(System.in, "windows-1252");
        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();
        System.out.print("Escribe una palabra: ");
        palabra = sc.nextLine();
        
        cantidadPalabrasEncontradas = buscarPalabras(frase, palabra);
        
        System.out.println("La palabra " + palabra + " aparece "  + cantidadPalabrasEncontradas + " veces en la frase.");
    }
    
}

package palabraapalabra;

import java.util.Scanner;

public class PalabraAPalabra {

    public static void main(String[] args) {
        // Introducir por teclado una frase palabra a palabra, 
        // y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
        // Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena «fin»
        // escrita con cualquier combinación de mayúsculas y minúsculas. La cadena «fin» no aparecerá en la frase final.
        String palabra,
                fin = "fin",
                frase = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce una palabra");
            palabra = sc.nextLine();
            frase += palabra + " ";
        } while (!palabra.toLowerCase().contains(fin));
        
        System.out.println(frase.toLowerCase().replace("fin", ""));
    }

}

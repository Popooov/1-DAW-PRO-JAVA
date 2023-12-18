package invertida;

import java.util.Scanner;

public class Invertida {
    static void invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder()
                .append(cadena)
                .reverse();
        
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
    
    public static void main(String[] args) {
        // Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
        // Un ejemplo, la cadena <hola mundo> quedaría <odnum aloH>.
        Scanner sc = new Scanner(System.in, "windows-1252");
        System.out.print("Dame la cadena para invertir: ");
        String cadena = sc.nextLine();
        
        invertirCadena(cadena);
    }
    
}

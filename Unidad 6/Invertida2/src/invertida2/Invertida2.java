package invertida2;

import java.util.Scanner;

public class Invertida2 {

    static void invertirCadena(String cadena) {
        String invertida = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            invertida = cadena.charAt(i) + invertida;
        }
        
        System.out.println("La cadena invertida: " + invertida);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "windows-1252");
        System.out.print("Escribe una cadena: ");
        String cadena = sc.nextLine();
        
        invertirCadena(cadena);
    }
    
}

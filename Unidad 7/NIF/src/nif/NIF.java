package nif;

import java.util.Scanner;

public class NIF {
    private int numeroDNI;
    private char letra;
    
    public NIF() {}
    
    public NIF(int numeroDNI) {
        this.numeroDNI = numeroDNI;
        this.letra = calcularLetra();
    }
    
    private char calcularLetra() {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M',
                            'Y', 'F', 'P', 'D', 'X', 'B',
                            'N', 'J', 'Z', 'S', 'Q', 'V',
                            'H', 'L', 'C', 'K', 'E'};
        return letrasDNI[(numeroDNI % 23)];
    }
    
    void leer() {
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Introduce un número DNI");
            numeroDNI = sc.nextInt();
        } while (numeroDNI <= 0);
    }
}

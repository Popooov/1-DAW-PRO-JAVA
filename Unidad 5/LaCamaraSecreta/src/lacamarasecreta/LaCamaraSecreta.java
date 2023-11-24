package lacamarasecreta;

import java.util.Arrays;
import java.util.Scanner;

public class LaCamaraSecreta {
    static int[] crearCombinacionSecreta(int longitudCombinacion) {
        int combinacionSecreta[] = new int[longitudCombinacion];
        int numeroAleatorio;
        
        for (int i = 0; i < combinacionSecreta.length; i++) {
            numeroAleatorio = (int) (Math.random() * 5 + 1);
            combinacionSecreta[i] = numeroAleatorio;
        }
        
        return combinacionSecreta;
    }
    
    static int[] acertarCombinacionSecreta() {
        int numerosAcertados[] = new int[0];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Especifica la longitud de la combinación (a mayor longitud, mayor será la dificultad del juego): ");
        int combinacionSecreta[] = crearCombinacionSecreta(sc.nextInt());
        System.out.println("Para abrir la cámara secreta tendrás que acertar la combinación de " + combinacionSecreta.length + " dígitos.");
        System.out.println("La combinación secreta consta de dígitos del uno al cinco.");
        
        int contador = 1;
        int numeroIntroducido;
        for (int numero : combinacionSecreta) {
            System.out.print("Introduce el dígito número " + contador + ": ");
            do {
                numeroIntroducido = sc.nextInt();
                if (numeroIntroducido > numero) {
                    System.out.println("El número introducido es mayor que el número en la posición " + contador + " de la combinación");
                    System.out.print("Introduce el dígito número " + contador + ": ");
                } else if (numeroIntroducido < numero) {
                    System.out.println("El número introducido es menor que el número en la posición " + contador + " de la combinación");
                    System.out.print("Introduce el dígito número " + contador + ": ");
                } else if (numeroIntroducido == numero) {
                    System.out.println("Has acertado el número en la posición " + contador + " de la combinación!");
                    numerosAcertados = Arrays.copyOf(numerosAcertados, numerosAcertados.length + 1);
                    numerosAcertados[numerosAcertados.length - 1] = numeroIntroducido;
                }
            } while (numero != numeroIntroducido);
            contador ++;
        }
            
        System.out.println("La combinación secreta es " + Arrays.toString(combinacionSecreta));
        return numerosAcertados;
    }
    
    public static void main(String[] args) {
        acertarCombinacionSecreta();
    }
}

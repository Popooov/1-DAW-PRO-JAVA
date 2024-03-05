package lista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Trabaja Como una Pila
        Pila c = new Lista();
        System.out.println("Introducir número entero (negativo para terminar): ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            c.apilar(n);
            System.out.println("Introducir número entero (negativo para terminar): ");
            n = new Scanner(System.in).nextInt();
        }
        n = c.desapilar();
        while (n != null) {
            System.out.println(n);
            n = c.desapilar();
        }

        //Trabaja Como una Cola
        Cola colita = new Lista();

        System.out.print("Escribe un número entero que no sea negativo: ");
        Integer num = new Scanner(System.in).nextInt();
        while (num >= 0) {
            colita.encolar(num);
            System.out.print("Escribe un número entero que no sea negativo: ");
            num = new Scanner(System.in).nextInt();
        }

        num = colita.desencolar();
        while (num != null) {
            System.out.println("El número es: " + num);
            num = colita.desencolar();
        }

    }
}

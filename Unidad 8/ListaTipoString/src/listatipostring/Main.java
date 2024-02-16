package listatipostring;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Trabaja Como una Pila
        Pila p = new ListaTipoString();
        System.out.println("Introducir una cadena ('stop' para terminar): ");
        String s1 = new Scanner(System.in).nextLine();
        while (!s1.equals("stop")) {
            p.apilar(s1);
            System.out.println("Introducir una cadena ('stop' para terminar): ");
            s1 = new Scanner(System.in).nextLine();
        }
        
        s1 = p.desapilar();
        while (!s1.equals("stop")) {
            System.out.println(s1);
            s1 = p.desapilar();
        }

        //Trabaja Como una Cola
        Cola c = new ListaTipoString();

        System.out.print("Escribe una cadena que no sea 'stop': ");
        String s2 = new Scanner(System.in).nextLine();
        while (!s2.equals("stop")) {
            c.encolar(s2);
            System.out.print("Escribe una cadena que no sea 'stop': ");
            s2 = new Scanner(System.in).nextLine();
        }

        s2 = c.desencolar();
        while (!s2.equals("stop")) {
            System.out.println("La cadena es: " + s2);
            s2 = c.desencolar();
        }
    }
}

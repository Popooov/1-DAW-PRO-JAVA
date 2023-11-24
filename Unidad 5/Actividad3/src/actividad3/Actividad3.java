package actividad3;

import java.util.Scanner;

public class Actividad3 {

    static void obtenerDatos(String[] grupo, int[] notas1eva, int[] notas2eva, int[] notas3eva) {
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("Notas de " + grupo[i] + ": 1ª eval: " + notas1eva[i] + ", 2ª eval: " + notas2eva[i] + ", 3ª eval: " + notas3eva[i]);
        }
    }

    static void mostrarNotaMediaDeGrupo(String[] grupo, int[] notas1eva, int[] notas2eva, int[] notas3eva) {
        int sumaNotas1eval = 0,
                sumaNotas2eval = 0,
                sumaNotas3eval = 0;

        double notaMedia1eval,
                notaMedia2eval,
                notaMedia3eval;

        for (int i = 0; i < grupo.length; i++) {
            sumaNotas1eval += notas1eva[i];
            sumaNotas2eval += notas2eva[i];
            sumaNotas3eval += notas3eva[i];
        }

        notaMedia1eval = (double) sumaNotas1eval / grupo.length;
        notaMedia2eval = (double) sumaNotas2eval / grupo.length;
        notaMedia3eval = (double) sumaNotas3eval / grupo.length;

        System.out.println("La nota media del grupo del primer trimestre: " + notaMedia1eval);
        System.out.println("La nota media del grupo del segundo trimestre: " + notaMedia2eval);
        System.out.println("La nota media del grupo del tercer trimestre: " + notaMedia3eval);
    }

    static void buscarPorIndiceONombre(String[] grupo, int[] notas1eva, int[] notas2eva, int[] notas3eva) {
        Scanner sc = new Scanner(System.in);

        int sumaNotas1eval = 0;

        double notaMedia1eval;

        System.out.print("Introduce el nombre de alumno: ");
        String nombreIntroducido = sc.nextLine();

        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i].equals(nombreIntroducido)) {
                sumaNotas1eval += notas1eva[i] + notas2eva[i] + notas3eva[i];
            }
        }

        notaMedia1eval = (double) sumaNotas1eval / 3;

        System.out.println("La nota media de " + nombreIntroducido + ": " + notaMedia1eval);
    }

    public static void main(String[] args) {
        String[] grupo = {"Nieves", "Alberto", "Ana", "Carlos", "Sandra", "Arancha", "Alex"};
        int[] notas1eva = {5, 6, 10, 4, 6, 5, 5};
        int[] notas2eva = {3, 6, 9, 4, 7, 7, 8};
        int[] notas3eva = {7, 7, 10, 5, 9, 8, 8};

        obtenerDatos(grupo, notas1eva, notas2eva, notas3eva);
        mostrarNotaMediaDeGrupo(grupo, notas1eva, notas2eva, notas3eva);
        buscarPorIndiceONombre(grupo, notas1eva, notas2eva, notas3eva);
    }

}

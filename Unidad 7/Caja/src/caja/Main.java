package caja;

public class Main {

    public static void main(String[] args) {
        Caja c1 = new Caja(6, 5, 2, Unidad.CM);
        System.out.println("El volumen de la caja: " + c1.getVolumen() + "cm");
        c1.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println("Destinatario: " + c1.getEtiqueta());
        System.out.println("Info de la caja:");
        System.out.println(c1.toString());
        System.out.println("--------------------------------------");
        Caja c2 = new Caja(6, 5, 2, Unidad.M);
        System.out.println("El volumen de la caja: " + c2.getVolumen() + "m");
        c2.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println("Destinatario: " + c2.getEtiqueta());
        System.out.println("Info de la caja:");
        System.out.println(c2.toString());
    }
}

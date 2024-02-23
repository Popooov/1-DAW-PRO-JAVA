package caja;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cajas: ");
        
        Caja c1 = new Caja(20, 30, 40, Unidad.CM);
        System.out.println("El volumen de la caja: " + c1.getVolumen() + (c1.unidadMedida == Unidad.CM ? "cm" : "m"));
        c1.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println("Destinatario: " + c1.getEtiqueta());
        System.out.println("Info de la caja:");
        System.out.println(c1.toString());
        
        System.out.println("----------------------------------------");
        
        Caja c2 = new Caja(6, 5, 2, Unidad.M);
        System.out.println("El volumen de la caja: " + c2.getVolumen() + (c1.unidadMedida == Unidad.M ? "m" : "cm"));
        c2.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println("Destinatario: " + c2.getEtiqueta());
        System.out.println("Info de la caja:");
        System.out.println(c2.toString());
        
        System.out.println("----------------------------------------");

        System.out.println("Cajas de carton:");

        CajaCarton cc1 = new CajaCarton(20, 30, 40);
        cc1.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println(cc1.toString());
        System.out.println(CajaCarton.cartonTotal() + "cm");
        
        System.out.println("----------------------------------------");
        
        CajaCarton cc2 = new CajaCarton(15, 25, 35);
        cc2.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println(cc2.toString());
        System.out.println(CajaCarton.cartonTotal() + "cm");
        
        System.out.println("----------------------------------------");
        
        CajaCarton cc3 = new CajaCarton(15, 25, 35);
        cc3.setEtiqueta("Olek Popov, Breña Alta");
        System.out.println(cc3.toString());
        System.out.println(CajaCarton.cartonTotal() + "cm");
        
        System.out.println(cc1.equals(cc2));
        System.out.println(cc2.equals(cc3));
    }
}

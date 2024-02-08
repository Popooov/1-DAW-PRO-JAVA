package punto;

public class Main {
    public static void main(String[] args) {
        Punto3D p1 = new Punto3D(-3.0, 1.0, 4.0);
        Punto3D p2 = new Punto3D(3.0, 1.0, 5.0);
        
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        
        System.out.println("Distancia euclídea");
        p1.distanciaEuclidea(p2);
    }
}

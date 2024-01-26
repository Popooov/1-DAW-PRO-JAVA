package punto;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3.0, 3.0);
        Punto p2 = new Punto(5.0, 2.0);
        p1.muestra();
        
        System.out.println("Desplazamiento");
        p1.desplazaX(2);
        p1.desplazaY(4);
        p1.muestra();
        
        System.out.println("Distancia euclídea");
        p1.distanciaEuclidea(p2);
    }
}

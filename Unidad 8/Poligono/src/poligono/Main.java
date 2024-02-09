package poligono;

public class Main {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(20, 60);
        Rectangulo r = new Rectangulo(15, 10);
        
        System.out.println(t);
        t.area();
        
        System.out.println(r);
        r.area();
    }
}

package poligono;


public class Triangulo extends Poligono {
    
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        double areaTriangulo = (altura * base) / 2;
        System.out.println("El área es: " + areaTriangulo);
        return areaTriangulo;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}

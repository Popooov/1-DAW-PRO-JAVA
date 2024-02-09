package poligono;

public class Rectangulo extends Poligono {
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        double areaRectangulo = base * altura;
        System.out.println("El área es: " + areaRectangulo);
        return areaRectangulo;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}

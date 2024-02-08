package poligono;

public class Rectangulo extends Poligono {

    @Override
    public double area() {
        return super.altura * super.base;
    }
    
}

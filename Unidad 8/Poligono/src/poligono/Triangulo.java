package poligono;


public class Triangulo extends Poligono {

    @Override
    public double area() {
        return super.altura * super.base;
    }
    
}

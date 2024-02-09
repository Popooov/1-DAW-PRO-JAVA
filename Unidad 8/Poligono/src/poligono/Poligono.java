package poligono;

public abstract class Poligono {
    protected double base, altura, area;
    
    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        String mensaje = "La base: " + base + ", la altura: " + altura;
        return mensaje;
    }
}

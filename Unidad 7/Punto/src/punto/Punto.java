package punto;

public class Punto {
    
    // Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y), con los métodos:

        // - Punto(double x, double y): construye un objeto con los datos pasados como parámetros.

        // - void desplazaX(double dx): incrementa el componente x en la cantidad dx.

        // - void desplazaY(double dy): incrementa el componente y en la cantidad dy.

        // - void desplaza(double dx, double dy): desplaza ambos componentes según las cantidades dx (en el eje x) y dy (en el componente y).

        // - doble distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea entre el punto invocante y el punto otro.

        // - void muestra(): muestra por consola la información relativa al punto
    
    double x;
    double y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    void desplazaX(double dx) {
        this.x += dx;
    }
    
    void desplazaY(double dy) {
        this.y += dy;
    }
    
    void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    double distanciaEuclidea(Punto otro) {
        double calcucarDistancia = Math.sqrt(Math.pow(x - otro.x, 2) + Math.pow(y - otro.y, 2));
        System.out.println(calcucarDistancia);
        return calcucarDistancia;
    }
    
    
    @Override
    public String toString() {
        return "x: " + this.x + ", " + "y: " + this.y;
    }
    
    @Override
    public boolean equals(Object o) {
        Punto otroPunto = (Punto) o;
        boolean iguales;
        iguales = this.x == otroPunto.x && this.y == otroPunto.y;
        
        return iguales;
    }
}

package punto;

public class Punto3D extends Punto {
    double z;
    
    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    double distanciaEuclidea(Punto3D otro) {
        double calcucarDistancia = Math.sqrt(
                Math.pow(x - otro.x, 2) + 
                Math.pow(y - otro.y, 2) +
                Math.pow(z - otro.z, 2)
        );
        System.out.println(calcucarDistancia);
        return calcucarDistancia;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + "z: " + this.z;
    }
}

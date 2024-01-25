package cuentacorriente;

public class Gestor {
    public String nombre;
    public final int telefono; 
    double importeMaximoAutorizado;
    
    public Gestor(String nombre, int telefono, double importeMaximoAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximoAutorizado = importeMaximoAutorizado;
    }
    
    public Gestor(String nombre, int telefono) {
        this(nombre, telefono, 10000.0);
    }
    
    void mostrarInfo() {
        System.out.println("Nombre de gestor: " + nombre);
        System.out.println("Teléfono de gestor " + telefono);
        System.out.println("El importe máximo autorizado por operación: " + importeMaximoAutorizado);
    }
    
}

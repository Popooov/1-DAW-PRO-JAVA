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
        this(nombre, telefono, 10.000);
    }
    
    void mostrarInfo() {
        System.out.println("Nombre del gestor: " + nombre);
        System.out.println("Teléfono del gestor " + telefono);
        System.out.println("El importe máximo autorizado por operación: " + importeMaximoAutorizado);
    }
    
}

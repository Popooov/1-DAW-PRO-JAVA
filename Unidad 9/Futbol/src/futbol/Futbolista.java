package futbol;

public class Futbolista implements Comparable {

    private String dni, nombre;
    private int edad, numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dni: " + dni + ", nombre: " + nombre + ", edad: " + edad + ", numeroGoles: " + numeroGoles + '}' + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        final Futbolista otro = (Futbolista) obj;

        if (this.dni.equals(otro.dni)) {
            iguales = true;
        }

        return iguales;
    }

    @Override
    public int compareTo(Object o) {
        return this.dni.compareTo(((Futbolista) o).dni);
    }

}

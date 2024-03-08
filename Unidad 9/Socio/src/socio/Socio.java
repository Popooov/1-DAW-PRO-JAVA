package socio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {

    int id; 
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        //establecemos el formato español para las fechas:
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    @Override
    //usamos la implementación de compareTo() para comparar el nombre
    public int compareTo(Object ob) {
        return nombre.compareTo(((Socio)ob).nombre) ;
    }

    @Override
    public String toString() {
        return "\nId: " + id + ", Nombre: " + nombre + ", Edad: " + edad();
    } 
}

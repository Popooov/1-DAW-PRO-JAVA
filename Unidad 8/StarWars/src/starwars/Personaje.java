package starwars;

public class Personaje {

    protected String nombre, raza;
    protected double fuerza;
    
    public Personaje(String nombre, String raza, double fuerza) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
    }

    public void presentarse() {
        System.out.println("Mi nombre es: " + this.nombre + ", soy de la raza " + this.raza);
    }

    public void usarFuerza() {
        System.out.println(this.nombre + " ha usado " + this.fuerza + " de su fuerza");
    }

    static String determinarGanador(Object personaje1, Object personaje2) {
        String ganador = "Empate";
        Personaje p1 = (Personaje) personaje1;
        Personaje p2 = (Personaje) personaje2;
        if (p1.fuerza > p2.fuerza) {
            ganador = p1.nombre;
        } else if(p1.fuerza < p2.fuerza) {
            ganador = p2.nombre;
        }
        
        return ganador;
    }
}

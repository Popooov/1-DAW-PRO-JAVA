package starwars;

import java.util.Arrays;

public class Sith extends Personaje {

    protected String maestro;
    protected String[] jediAsesinados = new String[0];

    public Sith(String nombre, String raza, double fuerza) {
        super(nombre, raza, fuerza);
    }

    public void matarJedi(String nombre) {
        this.jediAsesinados = Arrays.copyOf(this.jediAsesinados, this.jediAsesinados.length + 1);
        this.jediAsesinados[this.jediAsesinados.length - 1] = nombre;
    }

    public int numeroJediAsesinados() {
        return jediAsesinados.length;
    }

}

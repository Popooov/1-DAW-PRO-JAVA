package starwars;

import java.util.Arrays;

public class Jedi extends Personaje {

    protected enum ColorSable {
        VERDE, AZUL, AMARILLO, NARANJA, DORADO, BRONCE, PLATEADO, BLANCO
    };
    protected String planeta;
    protected boolean enamorado;
    protected String[] bloqueados = new String[0];
    protected String novie;

    public Jedi(
            String nombre,
            String raza,
            double fuerza,
            String planeta,
            boolean enamorado,
            String novie
    ) {
        super(nombre, raza, fuerza);
        this.planeta = planeta;
        if (enamorado) {
            this.enamorado = enamorado;
            this.novie = novie;
        } else {
            this.enamorado = false;
        }
    }

    public void usarLaFuerza() {
        super.usarFuerza();
    }

    public void enamorarse(String novie) {
        this.novie = novie;
        this.enamorado = true;
    }

    public void bloquear(String nombre) {
        if (this.novie.equals(nombre)) {
            this.novie = "";
            this.enamorado = false;
            this.bloqueados = Arrays.copyOf(this.bloqueados, this.bloqueados.length + 1);
            this.bloqueados[this.bloqueados.length - 1] = nombre;
        } else {
            this.bloqueados = Arrays.copyOf(this.bloqueados, this.bloqueados.length + 1);
            this.bloqueados[this.bloqueados.length - 1] = nombre;
        }
    }
}

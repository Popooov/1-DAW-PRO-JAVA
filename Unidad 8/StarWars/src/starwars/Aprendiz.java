package starwars;

public class Aprendiz extends Jedi {

    protected String maestro;
    protected boolean despertarFuerza;
    protected int nºmidiclorianos;

    public Aprendiz(
            String nombre,
            String raza,
            double fuerza,
            String planeta,
            boolean enamorado,
            String novie
    ) {
        super(nombre, raza, fuerza, planeta, enamorado, novie);
    }

    public void entrenar() {
        super.fuerza++;
        this.nºmidiclorianos = (int) (200000 / super.fuerza);
    }

    public void elegirMaestro(String maestro) {
        this.maestro = maestro;
    }

    public void despiertaFuerza() {
        this.despertarFuerza = true;
    }
}

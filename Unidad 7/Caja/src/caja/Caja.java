package caja;

public class Caja {

    final int ancho, alto, fondo;
    private String etiqueta;
    Unidad unidadMedida;
    private double volumen;

    public Caja(int ancho, int alto, int fondo, Unidad unidadMedida) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidadMedida = unidadMedida;
        if (this.unidadMedida == Unidad.CM) {
            volumen = (this.ancho / 100) * (this.alto / 100) * (this.fondo / 100);
        } else {
            volumen = this.ancho * this.alto * this.fondo;
        }
    }
    
    public double getVolumen() {
        return volumen;
    }
    
    @Override
    public String toString() {
        return "hola";
    }
}

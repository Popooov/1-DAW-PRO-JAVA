package caja;

public class Caja {
    final int ancho, alto, fondo;
    private String etiqueta;
    Unidad unidadMedida;
    
    public Caja(int ancho, int alto, int fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }
}

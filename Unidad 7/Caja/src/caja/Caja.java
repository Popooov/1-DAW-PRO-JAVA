package caja;

public class Caja {

    final int ancho, alto, fondo;
    private String etiqueta;
    Unidad unidadMedida;
    private final double volumen;

    public Caja(int ancho, int alto, int fondo, Unidad unidadMedida) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidadMedida = unidadMedida;
        if (this.unidadMedida == Unidad.CM) {
            volumen = (double) (ancho * alto * fondo) / 100;
        } else {
            volumen =  ancho * alto * fondo;
        }
    }
    
    public double getVolumen() {
        return volumen;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString() {
        if (unidadMedida == Unidad.CM) {
            return "El destinatario: " + this.etiqueta + "." +
                    "\nLas medidas de la caja son: " + 
                    "\nel ancho: " + this.ancho + "cm, " +
                    "\nel alto: " + this.alto + "cm, " +
                    "\nel fondo: " + this.fondo + "cm, " +
                    "\nel volumen: " + this.volumen + " cm.";
        } else {
            return "El destinatario: " + this.etiqueta + "." +
                    "\nLas medidas de la caja son: " + 
                    "\nel ancho: " + this.ancho + "m, " +
                    "\nel alto: " + this.alto + "m, " +
                    "\nel fondo: " + this.fondo + "m, " +
                    "\nel volumen: " + this.volumen + "m.";
        }
    }
}

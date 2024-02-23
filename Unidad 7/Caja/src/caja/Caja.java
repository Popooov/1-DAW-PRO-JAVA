package caja;

public class Caja {

    final double ancho, alto, fondo; // las medidas
    private String etiqueta; // la etiqueta
    Unidad unidadMedida; // centímetros o en metros
    protected double volumen; // el volumen de la caja
    
    // El costructor de la clase Caja
    public Caja(double ancho, double alto, double fondo, Unidad unidadMedida) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidadMedida = unidadMedida;
        // Calculamos el volumen de la caja en centímetros o en metros
        if (this.unidadMedida == Unidad.CM) {
            this.volumen = (double) (ancho * alto * fondo) / 100;
        } else {
            this.volumen =  ancho * alto * fondo;
        }
    }
    
    // Devuelve el volumen de la caja
    public double getVolumen() {
        return volumen;
    }

    // Devuelve la etiqueta con la info de la caja
    public String getEtiqueta() {
        return etiqueta;
    }

    // Iniciar la etiqueta
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    @Override
    // Devuelve la cadena con la info de la caja
    public String toString() {
        if (unidadMedida == Unidad.CM) {
            return "El destinatario: " + this.etiqueta + "." +
                    "\nLas medidas de la caja son: " + 
                    "\nel ancho: " + this.ancho + "cm, " +
                    "\nel alto: " + this.alto + "cm, " +
                    "\nel fondo: " + this.fondo + "cm, " +
                    "\nel volumen: " + this.volumen + "cm.";
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

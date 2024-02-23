package caja;

public class CajaCarton extends Caja {
    private final double area; // el area de la caja
    static double cartonTotal = 0; // la superficie total de las caja de carton
    
    // El constructor de la caja de carton 
    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidad.CM); // llamamos al costructor de la clase Caja
        super.volumen = super.getVolumen() * 0.80; // calculamos el 80% del volumen
        this.area = 2 * ((ancho * alto) + (ancho * fondo) + (alto * fondo)); // calculamos el area
        cartonTotal += this.area; // calculamos la superficie total de las cajas de carton
    }

    // Devuelve el area de la caja de carton
    public double getArea() {
        return area;
    }
    
    @Override
    // Devuelve el volumen de la caja de carton
    public double getVolumen() {
        return volumen;
    }
    
    @Override
    // Devuelve la cadena con la info de la caja de carton
    public String toString() {
        return super.toString() + 
            "\nEl area: " + this.area + "cm, " +
            "\nLa superficie total " + CajaCarton.cartonTotal + "cm.";
    }
    
    @Override
    // Compara si las cajas son iguales
    public boolean equals(Object o) {
        CajaCarton otraCaja = (CajaCarton) o;
        boolean iguales = false;
        if (super.alto == otraCaja.alto && super.ancho == otraCaja.ancho && super.fondo == otraCaja.fondo) {
            iguales = true;
        }
        
        return iguales;
    }
    
    // Devuelve el valor del atributo estático cartonTotal
    static double cartonTotal() {
        return CajaCarton.cartonTotal;
    }
}

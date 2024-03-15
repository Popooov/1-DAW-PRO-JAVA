package supermercado;

import java.time.LocalDate;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {

    private String marca, tipoVino, tipoEnvase;
    private double precio, volumen, descuento;
    private int calorias, gradosAlcohol;
    private LocalDate caducidad;

    public Vino(String marca, String tipoVino, int gradosAlcohol, double precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        this.calorias = gradosAlcohol * 10;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio * descuento);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Botella de vino:\n");
        sb.append(this.marca)
                .append(",\n")
                .append(this.precio)
                .append(",\n")
                .append(this.tipoVino)
                .append(",\n")
                .append(this.gradosAlcohol)
                .append(",\n")
                .append(this.tipoEnvase)
                .append(",\n")
                .append(this.caducidad)
                .append(",\n")
                .append(this.calorias)
                .append(",\n")
                .append(this.descuento);
        return sb.toString();
    }

}

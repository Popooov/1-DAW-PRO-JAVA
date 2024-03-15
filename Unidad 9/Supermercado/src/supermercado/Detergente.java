package supermercado;

public class Detergente implements EsLiquido, ConDescuento {

    private String marca, tipoEnvase;
    private double precio,
            volumen,
            descuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio - (this.precio * this.descuento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Detergente:\n");
        sb.append(this.marca)
                .append(",\n")
                .append(this.precio)
                .append(",\n")
                .append(this.tipoEnvase)
                .append(",\n")
                .append(this.volumen)
                .append(",\n")
                .append(this.descuento);
        return sb.toString();
    }

}

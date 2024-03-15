package supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento {

    private String marca, tipoCereal;
    private double precio;
    private LocalDate caducidad;
    private final int calorias;

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;

        switch (tipoCereal) {
            case "espelta":
                this.calorias = 5;
                break;
            case "maíz":
                this.calorias = 8;
                break;
            case "trigo":
                this.calorias = 12;
                break;
            default:
                this.calorias = 15;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
    public String toString() {
        StringBuilder sb = new StringBuilder("Caja de cereales:\n");
        sb.append(this.marca)
                .append(",\n")
                .append(this.precio)
                .append(",\n")
                .append(this.tipoCereal)
                .append(",\n")
                .append(this.caducidad)
                .append(",\n")
                .append(this.calorias);
        return sb.toString();
    }
}

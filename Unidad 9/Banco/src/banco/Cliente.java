package banco;

public interface Cliente {
    public String getDni();
    public String getNombre();
    public void setSaldo(double saldo);
    public double getSaldo();
    public void ingresarSaldo(double cantidad);
    public void retirarSaldo(double cantidad);
}

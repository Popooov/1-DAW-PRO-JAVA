package cuentacorriente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre del banco: " + CuentaCorriente.getBanco());
        CuentaCorriente.setBanco("La Caixa");
        System.out.println("Nombre del banco: " + CuentaCorriente.getBanco());
    }
}

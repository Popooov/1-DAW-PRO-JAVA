package cuentacorriente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre del banco: " + CuentaCorriente.getBanco());
        Gestor g1 = new Gestor("Lolo", 678678678, 100000.0);
        CuentaCorriente c1 = new CuentaCorriente("Y4694567X", "Tati", 1000.0, g1);
        c1.mostrarDatosCuenta();
    }
}

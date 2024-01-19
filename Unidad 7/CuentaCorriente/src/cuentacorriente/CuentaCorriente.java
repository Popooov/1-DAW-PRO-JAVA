package cuentacorriente;

public class CuentaCorriente {
    String dni; 
    public String nombre;
    private double saldo;
    static String banco = "Santander";
    
    CuentaCorriente (String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }
    
    CuentaCorriente (String dni, double saldo) {
        this.dni = dni;
        this.saldo = 0;
    }
    
    CuentaCorriente (String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }
    
    void sacarDinero (double cantidad) {
        if (saldo == 0) {
            System.out.println("No hay suficiente saldo");
        } else if (saldo < cantidad) {
            System.out.println("No hay suficiente saldo");
        } else {
            saldo -= cantidad;
            System.out.println("Ha sacado " + cantidad + " euros");
        }
    }
    
    void ingresarDinero (double cantidad) {
        if (cantidad > 0 && cantidad < 5) {
            System.out.println("No ha sido posible llevar a cabo la operación");
            System.out.println("La cantidad ingresada debe ser mayor que 5");
        } else {
            saldo += cantidad;
            System.out.println("Ha ingresado " + cantidad + " euros");
        }
    }
    
    void mostrarDatosCuenta () {
        if (nombre != null) {
            System.out.println("Nombre de titular: " + nombre);
        }
        System.out.println("DNI de titular: " + dni);
        System.out.println("El saldo de la cuenta es: " + saldo);
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }
}

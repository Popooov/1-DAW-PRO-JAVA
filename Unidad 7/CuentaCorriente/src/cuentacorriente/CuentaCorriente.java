package cuentacorriente;

public class CuentaCorriente {
    String dni, nombre;
    double saldo;
    
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
        System.out.println("Nombre de titular: " + nombre);
        System.out.println("DNI de titular: " + dni);
        System.out.println("El saldo de la cuenta es: " + saldo);
    }
    
    public static void main(String[] args) {
    // Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. 
    // Las operaciones típicas con una cuenta corriente son:
    // · Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
    // · Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    // · Ingresar dinero: se incrementa el saldo.
    // · Mostrar información: muestra la información disponible de la cuenta corriente.
        CuentaCorriente c = new CuentaCorriente();
        c.nombre = "Oleksandr";
        c.dni = "Y4693836X";
        
        c.ingresarDinero(1000);
        c.mostrarDatosCuenta();
        c.sacarDinero(100);
        c.mostrarDatosCuenta();
    }
}

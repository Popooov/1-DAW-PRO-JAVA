package cuentacorriente;

public class Main {
    public static void main(String[] args) {
    // Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. 
    // Las operaciones típicas con una cuenta corriente son:
    // · Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
    // · Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    // · Ingresar dinero: se incrementa el saldo.
    // · Mostrar información: muestra la información disponible de la cuenta corriente.
        CuentaCorriente c = new CuentaCorriente("Y4693836X", "Oleksandr");
        
        c.ingresarDinero(1000);
        c.mostrarDatosCuenta();
        c.sacarDinero(100);
        c.mostrarDatosCuenta();
        
        System.out.println("");
        
        CuentaCorriente c2 = new CuentaCorriente("Y4693836X", 500);
        c2.ingresarDinero(500);
        c2.mostrarDatosCuenta();
        c2.sacarDinero(100);
        c2.mostrarDatosCuenta();
        
        System.out.println("");
        
        CuentaCorriente c3 = new CuentaCorriente("Y4693836X", "Oleksandr", 500);
        c3.ingresarDinero(1000);
        c3.mostrarDatosCuenta();
        c3.sacarDinero(100);
        c3.mostrarDatosCuenta();
    }
}

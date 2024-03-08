package banco;

public class Persona implements Empleado, Cliente {

    private int horasTrabajadas;
    private double saldo;
    private final String dni;
    private String nombre;
    private boolean esEmpleado;
    private boolean esCliente;

    public Persona(
            String dni,
            String nombre,
            boolean esEmpleado,
            boolean esCliente
    ) {
        this.dni = dni;
        this.nombre = nombre;
        this.esCliente = esCliente;
        this.esEmpleado = esEmpleado;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void ingresarSaldo(double cantidad) {
        this.saldo += cantidad;
    }

    @Override
    public void retirarSaldo(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public void setHorasTrabajadas(int horas) {
        horasTrabajadas = horas;
    }

    @Override
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public void incremetarHoras(int horas) {
        horasTrabajadas += horas;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public boolean isEsCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }

    @Override
    public String getDni() {
        return dni;
    }
    
    @Override
    public String toString() {
        String resultado = "Persona: DNI - " + dni + ", nombre - " + nombre;
        if (esEmpleado) {
            resultado += "\nHoras trabajadas: " + horasTrabajadas;
        }
        if (esCliente) {
            resultado += "\nSaldo: " + saldo;
        }
        
        return resultado;
    }
}

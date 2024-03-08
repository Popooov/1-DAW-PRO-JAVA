package banco;

public interface Empleado {
    public String getDni();
    public String getNombre();
    public void setHorasTrabajadas(int horas);
    public int getHorasTrabajadas();
    public void incremetarHoras(int horas);
}

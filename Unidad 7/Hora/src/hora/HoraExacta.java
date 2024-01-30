package hora;

public class HoraExacta extends Hora {
    protected int segundos;
    
    public HoraExacta (int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }
    
    boolean setSegundos (int valor) {
        if (valor < 0 || valor > 60) {
            return false;
        } else {
            segundos = valor;
            return true;
        }
    }
    
    @Override
    void inc () {
        segundos++;
    }
    
    @Override
    public String toString () {
        String horaExacta = super.toString();
        horaExacta += ":" + segundos;
        return horaExacta;
    }
}

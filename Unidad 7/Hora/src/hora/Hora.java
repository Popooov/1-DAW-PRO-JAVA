package hora;

public class Hora {
    int hora;
    int minuto;
    
    Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    void inc() {
        this.minuto++;
    }
    
    boolean setHora(int valor) {
        return !(valor < 0 || valor > 23);
    }
    
    boolean setMinutos(int valor) {
        return !(valor < 0 || valor > 59);
    }
    
    @Override
    public String toString() {
        return "Hora - " + hora + ":" + minuto;
    }
}

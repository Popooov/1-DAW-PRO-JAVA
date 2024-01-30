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
        if (valor < 0 || valor > 23) {
            return false;
        } else {
            this.hora = valor;
            return true;
        }
    }
    
    boolean setMinutos(int valor) {
        if (valor < 0 || valor > 23) {
            return false;
        } else {
            this.minuto = valor;
            return true;
        }
    }
    
    @Override
    public String toString() {
        return "Hora - " + hora + ":" + minuto;
    }
}

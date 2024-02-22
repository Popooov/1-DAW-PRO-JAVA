package calendario;

public class Calendario {

    int anyo, mes, dia;

    public Calendario(int anyo, int mes, int dia) {
        if (anyo >= 0 && anyo <= 2024) {
            this.anyo = anyo;
        } else if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }
}

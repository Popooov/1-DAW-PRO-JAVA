package hora;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(20, 20);
        System.out.println(h1.toString());
        HoraExacta he1 = new HoraExacta(20, 20, 20);
        System.out.println(he1.toString());
    }
}

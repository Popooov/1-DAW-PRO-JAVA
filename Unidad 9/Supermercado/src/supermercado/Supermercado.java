package supermercado;

public class Supermercado {

    public static void main(String[] args) {
        Detergente d = new Detergente("Ariel", 10.0);
        d.setVolumen(1.0);
        d.setTipoEnvase("Plástico");
//        d.setDescuento(0.5);
        System.out.println(d);
    }

}

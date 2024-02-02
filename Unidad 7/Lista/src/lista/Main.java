package lista;

public class Main {
    public static void main(String[] args) {
        int[] otraLista = {3, 5, 7};
        Lista l1 = new Lista();
        l1.insertarAlFinal(5);
        l1.getTabla();
        l1.insertarAlFinalOtraLista(otraLista);
        l1.getTabla();
        l1.obtenerElemento(0);
    }
}

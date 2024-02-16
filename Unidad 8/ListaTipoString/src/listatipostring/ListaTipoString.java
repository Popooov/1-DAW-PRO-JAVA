package listatipostring;

import java.util.Arrays;
import java.util.Comparator;

public class ListaTipoString implements Cola, Pila {

    private int numeroElementos;
    private String[] lista;

    public ListaTipoString() {
        numeroElementos = 0;
        lista = new String[10];
    }

    //Podemos hacer que la capacidad inicial sea cualquier valor pasándosela 
    //al constructor
    public ListaTipoString(int capacidadInicial) {
        numeroElementos = 0;
        lista = new String[capacidadInicial];
    }

    //El número de elementos de la lista puede leerse desde fuera de la clase
    //aunque no modificarse
    int numeroElementos() {
        return numeroElementos;
    }

    @Override
    public void encolar(String s) {
        insertarFinal(s);
    }

    @Override
    public String desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(String s) {
        insertarFinal(s);
    }

    @Override
    public String desapilar() {
        return eliminar(numeroElementos - 1);
    }

    //Método de uso interno en la clase
    protected boolean listaLLena() {//No hay elementos libres en la lista
        return numeroElementos == lista.length;
    }

    void insertarPrincipio(String nuevo) {
        if (listaLLena()) {//Si la lista está llena, aumentamos en 10 su tamaño
            lista = Arrays.copyOf(lista, lista.length + 10);
        }
        for (int i = numeroElementos; i >= 1; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(String nuevo) {
        if (listaLLena()) {
            lista = Arrays.copyOf(lista, lista.length + 10);
        }
        lista[numeroElementos] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(ListaTipoString otraLista) {
        //Aumentamos la capacidad hasta que quepan los elementos de las dos
        //listas
        while (numeroElementos + otraLista.numeroElementos > lista.length) {
            lista = Arrays.copyOf(lista, lista.length + 10);
        }
        for (int i = numeroElementos, j = 0; j < otraLista.numeroElementos; i++, j++) {
            lista[i] = otraLista.lista[j];
            numeroElementos++;
        }
    }

    //El primer parámetro es el índice del lugar donde queremos insertar
    //el valor del segundo parámetro
    boolean insertar(int posicion, String nuevo) {
        boolean insertado = true;
        if (posicion < 0 || posicion > numeroElementos) {//índice no válido
            insertado = false;
        } else {
            if (listaLLena()) {
                lista = Arrays.copyOf(lista, lista.length + 10);
            }
            for (int i = numeroElementos; i > posicion; i--) {
                lista[i] = lista[i - 1];
            }
            lista[posicion] = nuevo;
            numeroElementos++;
        }
        return insertado;
    }

    String eliminar(int indice) {//si está vacía devuelve null
        String eliminado = null;
        if (indice >= 0 && indice < numeroElementos) {
            eliminado = lista[indice];
            for (int i = indice; i < numeroElementos - 1; i++) {
                lista[i] = lista[i + 1];
            }
            numeroElementos--;
        }
        return eliminado;
    }

    String eliminar(String clave) {//si está vacía devuelve null
        String eliminado = null;
        int posicion = buscar(clave);
        if (posicion != -1) {
            eliminado = eliminar(posicion);
        }
        return eliminado;
    }

    @SuppressWarnings("empty-statement")
    boolean eliminarTodos(String valor) {
        String res = eliminar(valor);
        while (eliminar(valor) != null);
        return res != null;
    }

    boolean eliminarTodos(ListaTipoString otra) {
        boolean res = false;
        for (int i = 0; i < numeroElementos; i++) {
            boolean eliminado = eliminarTodos(otra.get(i));
            if (eliminado) {
                res = true;
            }
        }
        return res;
    }

    /*Al siguiente método le pasaremos un índice y nos devolverá el
     elemento correspondiente de la lista sin modificarla. En el caso de que 
     el índice no sea válido, devolverá null, con lo cuál evitamos que el
     programa aborte*/
    String get(int indice) {
        String resultado = null;
        if (indice >= 0 && indice < numeroElementos) {//índice válido
            resultado = lista[indice];
        }
        return resultado;
    }

    int buscar(String claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < numeroElementos && indice == -1; i++) {
            if (lista[i].contains(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    void ordenar() {
        //No debemos olvidar que al final de la lista suele haber elementos 
        //null que, en una ordenación producirán errores. Por eso hay que 
        //escoger el rango donde hay elementos Integer válidos
        Arrays.sort(lista, 0, numeroElementos);
    }

    void ordenar(Comparator c) {
        Arrays.sort(lista, 0, numeroElementos, c);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < numeroElementos; i++) {
            res += lista[i] + " ";
        }
        return res;
    }
}

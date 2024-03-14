package sentidodecreciente;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] enterosAleatorios = new Integer[20];
        int max = 20;
        int min = 1;
        int rango = max - min + 1;

        for (int i = 0; i < enterosAleatorios.length; i++) {
            enterosAleatorios[i] = (int) (Math.random() * rango) + min;
        }

        System.out.println(Arrays.toString(enterosAleatorios));

//        SentidoDecreciente sd = new SentidoDecreciente();
//        Arrays.sort(enterosAleatorios, sd);

//        Arrays.sort(enterosAleatorios, new SentidoDecreciente());

        Arrays.sort(enterosAleatorios, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -((Integer) o1 - (Integer) o2);
            }
            
        });
        System.out.println(Arrays.toString(enterosAleatorios));
    }
}

package futbol;

import java.util.Arrays;

public class Futbol {

    public static void main(String[] args) {
        Futbolista [] futbolistas = new Futbolista[5];
        
        futbolistas[0] = new Futbolista("12345678A", "Andres", 21, 3);
        futbolistas[1] = new Futbolista("87654321B", "Fran", 24, 6);
        futbolistas[2] = new Futbolista("25678621B", "Manuel", 18, 1);
        futbolistas[3] = new Futbolista("45654321B", "Gabriel", 25, 4);
        futbolistas[4] = new Futbolista("37654321B", "Jorge", 22, 7);
        
        Arrays.sort(futbolistas);
        System.out.println(Arrays.deepToString(futbolistas));
        
        ComparaNombre cn = new ComparaNombre();
        Arrays.sort(futbolistas, cn);
        System.out.println(Arrays.deepToString(futbolistas));
        
        ComparaEdad ce = new ComparaEdad();
        Arrays.sort(futbolistas, ce);
        System.out.println(Arrays.deepToString(futbolistas));
    }

}

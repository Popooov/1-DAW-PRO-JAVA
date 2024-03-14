package socio;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio[] s = new Socio[6];
        s[0] = new Socio(2, "Antonio", "05-01-1989");
        s[1] = new Socio(4, "Pablo", "13-03-1981");
        s[2] = new Socio(3, "Carlos", "24-08-1990");
        s[3] = new Socio(6, "Gregorio", "18-02-1988");
        s[4] = new Socio(1, "Daniel", "17-06-1985");
        s[5] = new Socio(5, "Jaime", "08-11-1995");
        
        ComparaEdades c1 = new ComparaEdades();
        Arrays.sort(s, c1);
        System.out.println(Arrays.deepToString(s));
        
        ComparaEdadesDecreciente cd1 = new ComparaEdadesDecreciente();
        Arrays.sort(s, cd1);
        System.out.println(Arrays.deepToString(s));
        
        Arrays.sort(s, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Socio) o1).id - ((Socio) o2).id;
            }
        });
        
//        Arrays.sort(s, (Object o1, Object o2) -> ((Socio) o1).id - ((Socio) o2).id);
        
        System.out.println(Arrays.deepToString(s));
    }
}

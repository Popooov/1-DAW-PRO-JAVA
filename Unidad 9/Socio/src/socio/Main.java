package socio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio[] s = new Socio[3];
        s[0] = new Socio(2, "Antonio", "05-01-1989");
        s[1] = new Socio(1, "Pablo", "13-03-1981");
        s[2] = new Socio(3, "Carlos", "24-08-1990");
        
        ComparaEdades c1 = new ComparaEdades();
        Arrays.sort(s, c1);
        System.out.println(Arrays.deepToString(s));
        
        ComparaEdadesDecreciente cd1 = new ComparaEdadesDecreciente();
        Arrays.sort(s, cd1);
        System.out.println(Arrays.deepToString(s));
    }
}

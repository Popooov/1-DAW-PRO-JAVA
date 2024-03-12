package socio;

import java.util.Comparator;

public class ComparaEdadesDecreciente implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return -(((Socio) o1).edad() - ((Socio) o2).edad());
    }
}

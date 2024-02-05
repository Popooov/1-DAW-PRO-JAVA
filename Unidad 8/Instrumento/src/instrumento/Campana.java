package instrumento;

import java.util.Arrays;

public class Campana extends Instrumento {
    @Override
    void interpretar() {
        System.out.println(Arrays.toString(super.melodia));
    }
}

package instrumento;

import java.util.Arrays;

public class Piano extends Instrumento {
    @Override
    void interpretar() {
        System.out.println(Arrays.toString(super.melodia));
    }
}

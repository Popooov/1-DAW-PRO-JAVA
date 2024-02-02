package instrumento;

import java.util.Arrays;

public abstract class Instrumento {

    protected NotasMusicales[] melodia;

    public Instrumento() {
        melodia = new NotasMusicales[0];
    }

    void add(NotasMusicales nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    abstract void interpretar();
}

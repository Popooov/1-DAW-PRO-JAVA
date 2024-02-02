package instrumento;

public class Main {

    public static void main(String[] args) {
        Piano p = new Piano();
        Campana c = new Campana();
        
        p.add(NotasMusicales.FA);
        p.add(NotasMusicales.RE);
        p.add(NotasMusicales.LA);
        p.add(NotasMusicales.RE);
        
        p.interpretar();
        c.interpretar();
    }
}

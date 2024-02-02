package instrumento;

public class Main {

    public static void main(String[] args) {
        Piano p = new Piano();
        Campana c = new Campana();
        
        p.interpretar();
        c.interpretar();
    }
}

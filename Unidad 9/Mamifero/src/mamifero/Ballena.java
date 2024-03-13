package mamifero;

public class Ballena extends Mamifero {
    private final String nombreAnimal = "Ballena";
    
    @Override
    protected void amamantarCrias() {
        System.out.println(nombreAnimal + " amamanta a sus crías.");
    }
}

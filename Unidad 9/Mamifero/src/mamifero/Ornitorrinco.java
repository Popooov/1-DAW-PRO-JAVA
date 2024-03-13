package mamifero;

public class Ornitorrinco extends Mamifero {
    private final String nombreAnimal = "Ornitorrinco";
    
    @Override
    public void amamantarCrias() {
        System.out.println(nombreAnimal + " amamanta a sus crías.");
    }
}

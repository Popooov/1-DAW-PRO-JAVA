package mamifero;

public class Ornitorrinco extends Mamifero implements Oviparo {
    private final String nombreAnimal = "Ornitorrinco";
    
    @Override
    public void ponerHuevos() {
        System.out.println(nombreAnimal + " pone huevos.");
    }
    
    @Override
    protected void amamantarCrias() {
        System.out.println(nombreAnimal + " amamanta a sus crías.");
    }
}

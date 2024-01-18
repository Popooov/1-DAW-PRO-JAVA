package marcapagina;

public class MarcaPagina {

    int paginaActual;

    MarcaPagina() {
        this.paginaActual = 1;
    }
    
    public void incrementarPagina() {
        paginaActual++;
    }
    
    public int obtenerPaginaActual() {
        return paginaActual;
    }
    
    public void reiniciarLectura() {
        this.paginaActual = 1;
    }

    public static void main(String[] args) {
        // Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. 
        // Deberá disponer de métodos para:
        // - Incrementar la página leída,
        // - Para obtener información de la última página que se ha leído
        // - Para comenzar desde el principio una nueva lectura del mismo libro.
        
        MarcaPagina marca = new MarcaPagina();
        
        int paginaActual = marca.obtenerPaginaActual();
        System.out.println("Página actual: " + paginaActual);
        
        marca.incrementarPagina();
        marca.incrementarPagina();
        
        paginaActual = marca.obtenerPaginaActual();
        
        System.out.println("Nueva página actual: " + paginaActual);
        
        marca.reiniciarLectura();
        
        paginaActual = marca.obtenerPaginaActual();
        System.out.println("Después de reiniciar: " + paginaActual);
    }

}

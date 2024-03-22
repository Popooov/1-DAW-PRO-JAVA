package starwars;

import java.util.Arrays;

public class StarWars {

    public static void main(String[] args) {
        Jedi luke = new Jedi("Luke Skywalker", "humano", 8.0, "Tatooine");
        Sith darth = new Sith("Darth Vader", "humano", 9.0, "Tatooine");
        Aprendiz grogu = new Aprendiz("Grogu", "yoda", 1.0, "Coruscant");
        
        System.out.println(luke.nombre);
        System.out.println(luke.enamorado);
        luke.enamorarse("Leia");
        System.out.println(luke.enamorado);
        luke.bloquear("Leia");
        System.out.println(Arrays.toString(luke.bloqueados));
        System.out.println(luke.enamorado);
        luke.usarLaFuerza();
        
        System.out.println(darth.nombre);
        darth.matarJedi("Jeswi Ele");
        darth.matarJedi("Shia Letap");
        System.out.println(Arrays.toString(darth.jediAsesinados));
        System.out.println(darth.numeroJediAsesinados());
        
        System.out.println(grogu.nombre);
        System.out.println(grogu.fuerza);
        System.out.println(grogu.nºmidiclorianos);
        grogu.entrenar();
        System.out.println(grogu.fuerza);
        System.out.println(grogu.nºmidiclorianos);
        grogu.elegirMaestro("Luke Skywalker");
        System.out.println(grogu.maestro);
        System.out.println(grogu.despertarFuerza);
        grogu.despiertaFuerza();
        System.out.println(grogu.despertarFuerza);
        
        System.out.println(Personaje.determinarGanador(luke, darth));
    }

}

package eliminarcomentarios;

import java.util.Arrays;

public class EliminarComentarios {

    static public String eliminarComentarios(String sentencia) {
        String sentenciaSinComentarios = "";
        
        String[] splitted = sentencia.split("/");
        String[] striped = new String[0];

        for (String cadena : splitted) {
            striped = Arrays.copyOf(striped, striped.length + 1);
            striped[striped.length - 1] = cadena.strip();
        }

        for (String cadena : striped) {
            if (!cadena.contains("*")) {
                sentenciaSinComentarios += cadena + " ";
            }
        }
        
        return sentenciaSinComentarios;
    }

    public static void main(String[] args) {
        String sentencia = """
                            if (a==3) /* igual a tres */
                                a++; /* incrementamos a */""";
                
        
        System.out.println(eliminarComentarios(sentencia));
    }

}

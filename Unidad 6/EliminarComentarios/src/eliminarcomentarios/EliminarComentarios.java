package eliminarcomentarios;

public class EliminarComentarios {
    
//    public String eliminarComentarios (String sentencia) {
//        
//    }

    public static void main(String[] args) {
        // El preprocesador del lenguaje C elimina los comentarios (/*... */) del código fuente antes de compilar. 
        // Diseña un programa que lea por teclado una sentencia en C, y elimine los comentarios.
        // Sentencia:
        // if (a==3) /* igual a tres */
        //      a++; /* incrementamos a */
        // Salida: if (a==3) a++;
        int startOfComment = 0, endOfComment = 0;
        String sentencia = """
                            if (a==3) /* igual a tres */
                                a++; /* incrementamos a */""";
        
        for (int i = 0; i < sentencia.length(); i++) {
            System.out.print(sentencia.charAt(i));
            if (sentencia.charAt(i) == '/') {
                startOfComment = sentencia.indexOf('/');
            }
        }
        
        System.out.println(startOfComment);
        System.out.println(endOfComment);
//        System.out.println(sentencia.indexOf('/'));
//        System.out.println(sentencia.length());
    }
    
}

package codificacion;

public class Codificacion {
    
    char codifica(char conjunto1[],char conjunto2[], char c) {
        return 'c';
    }

    public static void main(String[] args) {
        // Se dispone de la siguiente relación de letras:
        // Conjunto 1: |e|i|k|m|p|q|r|s|t|u|v|
        // Conjunto 2: |p|v|i|u|m|t|e|r|k|q|s|
        // Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su correspondiente del conjunto 2.
        // El resto de las letras no se modifican. 
        // Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación en minúsculas.
        // Un ejemplo: la palabra «PaquiTo» se codifica como «matqvko».
        // Realizar un programa que codifique un texto. Para ello implementar la siguiente función:
        // char codifica(char conjunto1[],char conjunto2[], char c) que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
    }
    
}

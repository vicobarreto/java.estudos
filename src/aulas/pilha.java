package aulas;
import java.util.Stack;
public class pilha {
    public static String inverterString(String texto) {
        Stack<Character> pilha = new Stack<>();
        //1. empilhar: colocar cada char na pilha
    for(int i = 0; i < texto.length(); i++){
        pilha.push(texto.charAt(i));
        }
    //desempilhar: retirar do topo pra formar uma string nova
        StringBuilder textoInvertido = new StringBuilder();
    while (!pilha.isEmpty()) {
        textoInvertido.append(pilha.pop());
    }
    return textoInvertido.toString();
    }

    public static void main(String[] args) {
        String original = "ESTRUTURc";
        System.out.println("Original: " + original);
        System.out.println("INvertida: " + inverterString(original));
    }
}

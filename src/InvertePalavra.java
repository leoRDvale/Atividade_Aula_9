import java.util.Stack;

public class InvertePalavra {

    public static String inverter(String input) {
        String[] palavras = input.split(" "); //divide cada palavra com referencia ao espaço entre elas
        StringBuilder resultado = new StringBuilder();
        //para cada palavra da lista palavras, vou empilhar os caracteres
        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (int i = 0; i < palavra.length(); i++) {
                pilha.push(palavra.charAt(i));
            }

            // Ao desempilhar, devido a pilha ser no formato LIFO, ultimo que entra primeiro que sai,
            //a palavra digitava vai ser desempilhada "ao contrario"

            StringBuilder palavraInvertida = new StringBuilder();

            //enquanto a pilha não for vazia, usa o POP para remover e retornar o item que está no topo da pilha
            // usa o APPEND para inserir esse valor, retornado pelo pop, a String
            while (!pilha.isEmpty()) {
                palavraInvertida.append(pilha.pop());
            }

            // cada palavra vinda de palavraInvertidade vai ser adicionada ao resultado, adicionando espaço entre elas
            resultado.append(palavraInvertida).append(" ");
        }
        return resultado.toString();
    }

}

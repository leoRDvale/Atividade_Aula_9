import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar um programa, em estrutura de pilha, que inverta a ordem
        //das letras de cada palavra inserida, preservando a ordem das palavras
        //Os textos foram pré-definidos no exercicio, caso queira inserir qualquer texto
        //é só usar:

        /*System.out.println("Digite uma palavra o texto que deseja inverter a ordem das letras,\nmas preservando a ordem das palavras:");
        Scanner ler = new Scanner(System.in);
        String entrada = ler.next();
        String resultado = InvertePalavra.inverter(entrada);
        System.out.println("Frase original: "+entrada+"\nFrase invertida: "+resultado+"\n");*/

        String entrada = "ESTE EXERCICIO E MUITO FACIL";
        String resultado = InvertePalavra.inverter(entrada);
        System.out.println("Frase original: " + entrada + "\nFrase invertida: " + resultado + "\n");

        String entrada2 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado2 = InvertePalavra.inverter(entrada2);
        System.out.println("Frase original: " + entrada2 + "\nFrase invertida: " + resultado2 + "\n");


        String entrada3 = " ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        String resultado3 = InvertePalavra.inverter(entrada3);
        System.out.println("Frase original: " + entrada3 + "\nFrase invertida: " + resultado3 + "\n");


    }
}


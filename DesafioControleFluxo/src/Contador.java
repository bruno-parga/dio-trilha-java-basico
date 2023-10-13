import java.util.Random;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Segundo Parâmentro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametro Um é MAIOR que parametroDois e lançar a exceção
        if(parametroDois < parametroUm){
            //chamando o método contendo a lógica de contagem
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        System.out.println("Valor total de ocorrências: " + contagem);
        for(int contador = 1; contador <= contagem; contador++){
            System.out.println("Imprimindo o número " + contador);
        }
        if(contagem == 0){
            System.out.println("Não há o que imprimir pois houve 0 ocorrências");
        }
    }
}

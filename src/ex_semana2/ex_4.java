package ex_semana2;
import java.util.Scanner;
public class ex_4 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        Integer[] vetor = new Integer[20];
        int i, a = 0, b = 19;

        for (i = 0; i < 20; i++) {
            System.out.println("Entre com um numero:");
            vetor[i] = texto.nextInt();
        }
        for (i = 0; i < 20; i++) {
            System.out.println(" O numero de posicao "+i +" digitado foi:"+vetor[i] );

        }
        for (i = 0; i < 10; i++) {
            vetor[a] = vetor[b];
            a++;
            b--;
        }
        for (i = 0; i < 20; i++) {
            System.out.println(" O numero de posicao " +i+" apos a troca e:"+ vetor[i]);

        }
        texto.close();
    }
}


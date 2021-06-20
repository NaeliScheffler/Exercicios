package ex_semana2;
import java.util.Scanner;
public class ex_3 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Integer[] vetor1 = new Integer[10];

        int i,menor,mposicao;
        System.out.println("Insira um numero:");
        vetor1[0] = texto.nextInt();
        menor=vetor1[0];
        mposicao=vetor1[0];
        for (i = 1; i < 10; i++) {
            System.out.println("Insira um numero:");
            vetor1[i] = texto.nextInt();

            if (vetor1[i]<menor ) {
                menor = vetor1[i];
                mposicao = i;
            }
        }
        System.out.println("Menor valor:"+menor);
        System.out.println("Posicao:"+mposicao);
        texto.close();
    }
}


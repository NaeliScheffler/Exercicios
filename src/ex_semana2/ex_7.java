package ex_semana2;
import java.util.Scanner;
public class ex_7 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Integer[] V = new Integer[10];
        int N, i, j=1, encontr = 0, p = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("Insira o valor " + j+ "  para V:");
            V[i] = texto.nextInt();
        }
        System.out.println("Insira um valor  para N: ");
        N = texto.nextInt();
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 1; j++) {
                if (V[i] == N) {
                    encontr = 100;
                    p = i;
                }
            }
        }
        if (encontr == 100) {
            System.out.println("Encontrado na posicao:  "+ p);
        } else {
            System.out.println("Numero nao encontrado  ");
        }

        texto.close();
    }
}


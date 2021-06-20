package ex_semana2;
import java.util.Scanner;
public class ex_1 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        Integer[] vetor = new Integer[20];
        int cont = 0, i;

        for (i = 0; i < 20; i++) {
            System.out.println("Insira um elemento inteiro:");
            vetor[i] = texto.nextInt();

            if (vetor[i] % 2 == 0) {
                cont++;
            }
        }
        System.out.println("A quantidade de pares e:" + cont);


        texto.close();




    }
}


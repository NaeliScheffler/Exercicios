package ex_semana2;
import java.util.Scanner;
public class ex_2 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Integer[] vetor1 = new Integer[10];
        Integer[] vetor2 = new Integer[10];
        Integer[] mult = new Integer[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Insira um numero:");
            vetor1[i] = texto.nextInt();
            System.out.println("Insira um segundo número:");
            vetor2[i] = texto.nextInt();
            mult[i] = vetor1[i] * vetor2[i];
            System.out.println("A multiplicação dos dois números resulta em:"+mult[i]);


        }
        texto.close();
    }
}


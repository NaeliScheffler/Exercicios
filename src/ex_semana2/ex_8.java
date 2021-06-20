package ex_semana2;
import java.util.Scanner;
public class ex_8 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Integer[] V = new Integer[15];
        int i, j = 15,k=1;
        Integer auxmaior;
        Integer auxmenor;
        for (i = 0; i < j; i++) {
            System.out.println("Insira o valor " + k + "  para V:");
            V[i] = texto.nextInt();
            k++;
        }
        for (i = 0; i < j; i++) {
            for (j = i + 1; j < 15; j++) {
                if (V[i] < V[j]) {
                    auxmaior = V[j];
                    auxmenor = V[i];
                    V[i] = auxmaior;
                    V[j] = auxmenor;
                } else if (V[i] > V[j]) {
                    auxmaior = V[i];
                    auxmenor = V[j];
                    V[i] = auxmaior;
                    V[j] = auxmenor;
                }

            }
        }
        System.out.println("O vetor V em ordem decrescente e  :");
        for (i = 0; i < 15; i++) {
            System.out.println(V[i]);
        }
        texto.close();
    }
}


package ex_semana7;
import java.util.ArrayList;
import java.util.Scanner;

public class ex_2 {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int i;
        int j = 0;

        do {
            System.out.println("\n Insira um elemento positivo: \n");
            i = texto.nextInt();
            if (i >= 0) {
                numeros.add(i);
                j++;
            }
        } while (i >= 0 && j < 10);

        for (Integer aux1 : numeros) {
            System.out.println(" \n Elementos: " + aux1);
        }
        for (j = 0; j < numeros.size(); j++) {
            if ((numeros.get(j) % 2) == 0) {
                numeros.remove(j);
            }
        }
        for (Integer aux : numeros) {
            System.out.println(" \n Elementos: " + aux);
        }
        texto.close();
    }

}

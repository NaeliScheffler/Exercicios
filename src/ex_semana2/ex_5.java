package ex_semana2;
import java.util.Scanner;
public class ex_5 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Integer[] result = new Integer[6];
        Integer[] ap1 = new Integer[6];
        Integer[] ap2 = new Integer[6];
        Integer[] ap3 = new Integer[6];
        Integer[] ap4 = new Integer[6];
        Integer[] ap5 = new Integer[6];
        int i, c = 1, ac1 = 0, ac2 = 0, ac3 = 0, ac4 = 0, ac5 = 0;

        for (i = 0; i < 6; i++) {
            System.out.println("Insira o " +  c + " numero sorteado na loteria:");
            result[i] = texto.nextInt();
            c++;
        }
        c = 1;
        for (i = 0; i < 6; i++) {
            System.out.println("Insira o " + c + " numero do apostador 1:");
            ap1[i] = texto.nextInt();
            System.out.println("Insira o " + c + " numero do apostador 2:");
            ap2[i] = texto.nextInt();
            System.out.println("Insira o " + c + " numero do apostador 3:");
            ap3[i] = texto.nextInt();
            System.out.println("Insira o " + c + " numero do apostador 4:");
            ap4[i] = texto.nextInt();
            System.out.println("Insira o " + c + " numero do apostador 5:");
            ap5[i] = texto.nextInt();
            c++;
        }
        for (i = 0; i < 6; i++) {
            if (result[i].equals(ap1[i])) {
                ac1 = ac1 + 1;
            }
            if (result[i].equals(ap2[i])) {
                ac2 = ac2 + 1;
            }
            if (result[i].equals(ap3[i])) {
                ac3 = ac3 + 1;
            }
            if (result[i].equals(ap4[i])) {
                ac4 = ac4 + 1;
            }
            if (result[i].equals(ap5[i])) {
                ac5 = ac5 + 1;
            }
        }
        System.out.println(" O total de acertos do apostador 1 e: " + ac1);
        System.out.println(" O total de acertos do apostador 2 e: " + ac2);
        System.out.println(" O total de acertos do apostador 3 e: " + ac3);
        System.out.println(" O total de acertos do apostador 4 e: " + ac4);
        System.out.println(" O total de acertos do apostador 5 e: " + ac5);

        if (ac1 > ac2 && ac1 > ac3 && ac1 > ac4 && ac1 > ac5) {
            System.out.println(" O apostador 1 e o ganhador");
        } else if (ac2 > ac1 && ac2 > ac3 && ac2 > ac4 && ac2 > ac5) {
            System.out.println(" O apostador 2 e o ganhador");
        } else if (ac3 > ac1 && ac3 > ac2 && ac3 > ac4 && ac3 > ac5) {
            System.out.println(" O apostador 3 e o ganhador");
        }
        if (ac4 > ac1 && ac4 > ac2 && ac4 > ac3 && ac4 > ac5) {
            System.out.println(" O apostador 4 e o ganhador");
        }
        if (ac5 > ac1 && ac5 > ac2 && ac5 > ac3 && ac5 > ac4) {
            System.out.println(" O apostador 5 e o ganhador");
        }
        texto.close();
    }
}



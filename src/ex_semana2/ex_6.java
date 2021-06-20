package ex_semana2;
import java.util.Scanner;
public class ex_6 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Integer[] X = new Integer[10];
        Integer[] Y = new Integer[10];
        Integer[] P = new Integer[20];
        Integer[] aux = new Integer[20];
        int c = 1, i, d;
        for (i = 0; i < 10; i++) {
            System.out.println("Insira o " + c + " valor para X:");
            X[i] = texto.nextInt();
            System.out.println("Insira o " + c + " valor para Y:");
            Y[i] = texto.nextInt();
            c++;
        }
        System.out.println("Os valores inseridos para X foram:");
        for (i = 0; i < 10; i++) {
            System.out.println(+X[i]);
        }
        System.out.println("Os valores inseridos para Y foram:");
        for (i = 0; i < 10; i++) {
            System.out.println(+Y[i]);
        }
        
        for (i = 0; i < 10; i++) {
            aux[i] = X[i];
            aux[i + 10] = Y[i];
        }
        for (i = 0; i < 10; i++) {
            P[i] = X[i];
            P[i + 10] = Y[i];
        }
        c = 0;
        for (i = 0; i < 20; i++) {
            for (d = i + 1; d < 20; d++) {
                if (P[i].equals(P[d])) {
                    aux[c] = P[i];
                    P[d] = 0;
                    c++;

                }

            }
        }
        System.out.println("A uniao de X e Y e :");
        for (i = 0; i < 20; i++) {
            if (P[i] != 0) {
                System.out.println(+P[i]);
            }
        }
        System.out.println("A interseccao de X e Y e :");

        for (  i=0; i<10; i++ ) {
            for ( int j=0; j<10; j++ ) {
                if (X[i].equals(Y[j])) {
                    P[i]=X[i];
                    System.out.print(+P[i] );
                }
            }
        }



        for (i = 0; i < 10; i++) {
            P[i] = X[i] - Y[i];
        }
        System.out.println("\n A diferenca de X e Y e :");
        for (i = 0; i < 10; i++) {
            System.out.println(+P[i]);
        }

        for (i = 0; i < 10; i++) {
            P[i] = X[i] + Y[i];
        }
        System.out.println("A soma de X e Y e :");
        for (i = 0; i < 10; i++) {
            System.out.println(+P[i]);
        }

        for (i = 0; i < 10; i++) {
            P[i] = X[i] * Y[i];
        }
        System.out.println("O produto de X e Y e :");
        for (i = 0; i < 10; i++) {
            System.out.println(+P[i]);
        }
        texto.close();
    }
}



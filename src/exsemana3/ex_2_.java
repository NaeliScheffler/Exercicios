package exsemana3;
import java.util.Scanner;
public class ex_2_ {

        public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);

            int n;

            System.out.println("\nInsira o valor numerico :\n");
            n = texto.nextInt();
            String numString = Integer.toString(n);

            System.out.println(
                    numString.replace("0", "zero," ).
                            replace("1", "um," ).
                            replace("2", "dois," ).
                            replace("3", "tres," ).
                            replace("4", "quatro," ).
                            replace("5", "cinco," ).
                            replace("6", "seis," ).
                            replace("7", "sete," ).
                            replace("8", "oito," ).
                            replace("9", "nove," )
            );
            texto.close();
        }
    }



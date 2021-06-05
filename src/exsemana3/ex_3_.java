package exsemana3;
import java.util.Scanner;
public class ex_3_ {


        public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);
            int i=0;


            System.out.println("\nInsira um nome completo:\n");
            String nome = texto.nextLine().toUpperCase();

            System.out.println("\nAs iniciais do nome são:\n");

            System.out.println(nome.charAt(0));
            for ( i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == ' ') {
                    System.out.println(nome.charAt(i+1));
                }
            }
            texto.close();
        }
    }



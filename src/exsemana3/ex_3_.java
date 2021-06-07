package exsemana3;
import java.util.Scanner;
public class ex_3_ {


        public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);
            int i;

            System.out.println("\nInsira um nome completo:\n");
            String nome = texto.nextLine().toUpperCase();

            System.out.println("\nAs iniciais do nome são:\n");
            nome = nome.replaceAll("da|das|do|dos|de|di|e", "");

            System.out.print(nome.charAt(0));
            for ( i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == ' ') {
                    System.out.print(nome.charAt(i + 1));
                }
            }
            texto.close();
        }

}



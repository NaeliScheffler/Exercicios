package exsemana3;
import java.util.Scanner;
public class ex_4_ {

        public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);
            int i, p=1, esp=0, tot=0;

            System.out.println("\nInsira um texto:\n");
            String palavras = texto.nextLine();

            for ( i = 0; i < palavras.length(); i++) {
                if (palavras.charAt(i) == ' ') {
                    p++;
                    esp++;
                }
            }
            tot=palavras.length()-esp;
            System.out.printf("\n A quantidade de palavras na string e : %d e a quantidade de caracteres total e: %d",p,tot);

            texto.close();
        }
    }



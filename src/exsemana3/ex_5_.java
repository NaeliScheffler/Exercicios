package exsemana3;
import java.util.Scanner;
public class ex_5_ {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);


        System.out.println("\nInsira uma frase:\n");
        String palavras = texto.nextLine();

        palavras = palavras.trim().replaceAll("\\s+", " ");

        System.out.println(palavras);
        texto.close();
    }
}
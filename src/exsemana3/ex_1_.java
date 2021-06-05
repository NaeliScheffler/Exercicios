package exsemana3;

import java.util.Scanner;
public class ex_1_ {


    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        String s;
        System.out.println("\nInsira uma string:\n");
        s = texto.next();
        System.out.printf("\nQuantidade de caracteres:  %d\n", s.length());
        System.out.println("\nString em letras maiusculas:\n");
        System.out.println(s.toUpperCase());
        System.out.println("\nQuantidade de vogais:\n");
        System.out.println(s.length() - s.toLowerCase().replaceAll("a|e|i|o|u|", "").length());
        System.out.println("\nComeCa com U-N-I\n? "+s.toLowerCase().startsWith("uni"));
        System.out.println("\n ComeCa com R-I-O?\n "+ s.toLowerCase().startsWith("rio"));
        System.out.println("\n Possui quantos digitos?\n ");
        System.out.println(s.length() - s.toLowerCase().replaceAll("0|1|2|3|4|5|6|7|8|9()", "").length());
        System.out.println("\nE um palindromo \n"+s.equals(new StringBuilder(s).reverse().toString()));
        texto.close();
    }
}


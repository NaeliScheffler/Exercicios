package ex_semana6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Kaio");
        nomes.add("Ana");
        nomes.add("Eliana");
        nomes.add("Zeus");
        System.out.println("Nomes na lista:\n");
        for (String ord : nomes) {
            System.out.println(ord);
        }
        System.out.println("Qual nome deseja remover? Para remover todos insira clear.\n");
        String nome = texto.nextLine();
        if (nome.equals("clear")) {
            nomes.clear();
            System.out.println("Voce limpou a lista de nomes. \n ");
        }else {
            System.out.println("Voce removeu o nome:\n" + nome);
            nomes.remove(nome);
        }
        System.out.println("A lista ficou assim:");
        for (String ord : nomes) {
            System.out.println(ord);
        }
    texto.close();
    }

}
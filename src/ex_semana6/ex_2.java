package ex_semana6;

import java.util.ArrayList;
import  java.util.Collections ;
public class ex_2 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Ordenando nomes\n");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Kaio");
        nomes.add("Ana");
        nomes.add("Eliana");
        nomes.add("Zeus");

        Collections.sort(nomes);
        System.out.println("Nomes ordenados:");

        for (String ord : nomes) {
            System.out.println(ord);
        }
    }
}

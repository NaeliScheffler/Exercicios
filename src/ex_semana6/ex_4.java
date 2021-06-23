package ex_semana6;
import java.util.ArrayList;
import java.util.Scanner;
public class ex_4 {
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
        nomes.add("Paulo");
        nomes.add("Jose");
        nomes.add("Mateus");

        System.out.println("Nomes na lista:\n");
        for (String ord : nomes) {
            System.out.println(ord);
        }
        System.out.println("Qual nome deseja buscar?\n");
        String nome= texto.nextLine();
        if (nomes.contains(nome)) {
            System.out.println(" O nome está na lista. \n");
        }

            System.out.print("Seu antecessor eh :\n");
         int indice = nomes.indexOf(nome);
         indice=indice-1;
        System.out.print(nomes.get(indice));
        System.out.print("\nSeu sucessor eh :\n");
        indice=indice+2;
        System.out.print(nomes.get(indice));

        texto.close();
    }
}
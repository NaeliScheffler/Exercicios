package ex_semana6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        String nome;
        ArrayList<String> pessoas = new ArrayList<>();

        System.out.println("Insira um nome:\n");
        nome= texto.nextLine();
        while ( ! nome . equals ( "vazio" )) {

            if (pessoas.contains(nome)) {
                System.out.println(" O nome já está na lista. ");
                System.out.print(" Insira outro nome:\n");
                nome= texto.nextLine();
            }
            pessoas . add(nome);
            System. out.println ( " Informe outro nome ou escreva vazio para parar: \n" );
            nome = texto . nextLine ();



        }



        for (String contem : pessoas) {
            System.out.println(" Nome inserido: " + contem + " \n Posição: " + pessoas.indexOf(contem));
        }


        texto.close();

    }
}

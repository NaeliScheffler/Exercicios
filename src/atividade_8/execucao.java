package atividade_8;
import java.util.Scanner;
public class execucao {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        funcionarios f1 = new funcionarios();
        f1.nome = "Hugo";
        f1.salario = 100;
        String data;
        data="08/02/2001";
        f1.data_entr=data;
        f1.aumento(100);

        f1.anual();



        funcionarios f2 = new funcionarios();
        f2.nome = "Danilo";
        f2.salario = 100;
        f2 = f1;

        f2.getData_entr();
        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        f1.demite();
        f1.mostrar();

    }
}

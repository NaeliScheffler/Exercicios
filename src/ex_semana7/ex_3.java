package ex_semana7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        ArrayList<String> listaTel =  new  ArrayList<>();
        int j,y;
        String z;
        do{
            System.out.println("\n 1- para cadastrar\n 2- para listar\n 3- para remover\n 4- para parar \n");
            y=texto.nextInt();
            if(y==1){
                System.out.println("\n Insira nome;telefone:\n");
                z=texto.next();
                listaTel.add(z);
            }
            if(y==2){
                Collections.sort(listaTel);
                    System.out.println(listaTel);
            }
            if(y==3){
                System.out.println("\n Insira o indice do contato que deseja remover:\n");
                j=texto.nextInt();
                listaTel.remove(j);
            }
            if(y==4){
                System.out.println("\n Voce parou....\n");
            }
        }while (y!=4);
    }
}

package ex_semana4;
import java.util.Scanner;
public class ex_2 {
    public static void main(String[] argv) {

        Scanner texto = new Scanner(System.in);
        String frase="Socorram-me, subi no ônibus em Marrocos";
        String[] aux=frase.split(" ");

        StringBuilder aux2=new StringBuilder();
        for(int i=aux.length-1; i>=0;i--){
            aux2.append(aux[i]).append(" ");
        }
        System.out.println(aux2);




        texto.close();


    }

}

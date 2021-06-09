package ex_semana4;
import java.util.Scanner;
public class ex_2 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        String[] a;
        int j;
        System.out.print("Entre com uma frase: ");
        String frase = texto.nextLine();

        a = frase.split(" ");
        j=(a.length);
        j=j-1;
        for(int i=0;i<a.length;i++){
            System.out.println(a[j]);
            j--;
        }





        texto.close();


    }

}

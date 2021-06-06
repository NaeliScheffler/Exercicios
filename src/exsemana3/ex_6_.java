package exsemana3;


import java.util.Random;
import java.util.Scanner;
public class ex_6_ {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        Random aleatorio = new Random();
        int i;
        int valor = aleatorio.nextInt(7);
        int valor2 = aleatorio.nextInt(3);
        String[] letra= new String[4];
        String[] s1= new String[8];
        String[] s2 = new String[8];
        String[] s3 = new String[8];
        String [] s4= new String[8];
       for( i=0;i<8;i++){
           System.out.println("\nInsira 1 codigos genetico para s1:\n");
            s1[i]= texto.next();


           System.out.println("\nInsira 1 codigos genetico para s2:\n");
           s2 [i]= texto.next();


       }
        for( i=0;i<4;i++){
            s3[i]=s1[i];
            s3[i+4]=s2[i+4];

        }
        for( i=0;i<4;i++) {

            s4[i] = s2[i];
            s4[i+4] = s1[i + 4];

        }

        letra[0]= "a";
        letra[1]= "t";
        letra[2]= "g";
        letra[3]= "c";


        s3[valor]=letra[valor2];

        System.out.print("\nCodigo genetico de s1:\n");
        for(i=0;i<7;i++){
            System.out.printf("\n%s",s1[i]);
        }
        System.out.print("\nCodigo genetico de s2:\n");
        for(i=0;i<7;i++){
            System.out.printf("\n%s",s2[i]);
        }
        System.out.print("\nCodigo genetico de s3:\n");
        for(i=0;i<7;i++){
            System.out.printf("\n%s",s3[i]);
        }
        System.out.print("\nCodigo genetico de s4:\n");
        for(i=0;i<7;i++){
            System.out.printf("\n%s",s4[i]);
        }
        texto.close();
    }
}
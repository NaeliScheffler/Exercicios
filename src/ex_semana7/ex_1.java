package ex_semana7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ex_1 {

        public static void main (String[]args) {
            Scanner texto = new Scanner(System.in);
            ArrayList<Integer> numeros=new ArrayList<>();
            int i;
            int j;

            do {
                System.out.println ( "\n Digite um numero interio para adicionar na lista e um negativo para parar: \n" );
                i= texto.nextInt();
                if (i>= 0){
                    numeros.add(i);
                }
            }while(i>=0);

            for(j=0;j< numeros.size();j++){
                Integer aux=numeros.get(j);
            System.out.println("\n Elemento: "+aux);
            }

            for(Integer aux1:numeros){
                System.out.println("\n Elemento: "+aux1);
            }

            Iterator<Integer> it=numeros.iterator();

            while(it.hasNext()){
                Integer aux2= it.next();
                System.out.println("\n Elemento: "+aux2);
            }
 texto.close();
        }
    }
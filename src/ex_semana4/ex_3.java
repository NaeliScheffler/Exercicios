package ex_semana4;
import java.util.Scanner;
public class ex_3 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        int i=0;
        boolean aux1 = false;
        StringBuilder aux2 = new StringBuilder();
         String fraseTeste1 = "pA pppapppa pdpo pPpapppa./";
        String fraseTeste2 = " pUpm pfpiplpmpe plpepgpapl.";


        for(; i<fraseTeste1.length(); i++ ){
            if (fraseTeste1.charAt(i) == 'p' && !aux1) {
                aux1 = true;
            } else {
                aux2.append(fraseTeste1.charAt(i));
                aux1 = false;
            }
        }


        for(i=0; i<fraseTeste2.length(); i++ ){
            if (fraseTeste2.charAt(i) == 'p' && !aux1) {
                aux1 = true;
            } else {
                aux2.append(fraseTeste2.charAt(i));
                aux1 = false;
            }
        }
        System.out.println(aux2);






    }
}
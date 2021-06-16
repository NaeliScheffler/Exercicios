package ex_semana5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex_2 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);


        String fonte;
        String verificacao_t= "^(((https?|ftp)://)?([\\w\\-.])+(\\.)([\\w]){2,4}([\\w/+=%&_.~?\\-]*))*$";

        System.out.println("Insira uma URL");
        fonte=texto.next();
        Pattern padrao = Pattern.compile(verificacao_t);
        Matcher match = padrao.matcher(fonte);
        if(match.find()){
            System.out.println("URL valida");

        }else  {
            System.out.println("URL invalida");

        }

        texto.close();

    }
}

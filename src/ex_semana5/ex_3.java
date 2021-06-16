package ex_semana5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex_3 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);



        String fonte;
        String verificacao_t= "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";

        System.out.println("Insira uma senha ");
        fonte=texto.next();
        Pattern padrao = Pattern.compile(verificacao_t);
        Matcher match = padrao.matcher(fonte);
        if(match.find()){
            System.out.println("Senha forte");

        }else  {
            System.out.println("Senha nao eh forte");

        }

        texto.close();
    }
    }

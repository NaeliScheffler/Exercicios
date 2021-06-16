package ex_semana5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex_1 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

   String fonte;
   String verificacao_t= "(^[0-9]{2})?(\\s|-)?(9?[0-9]{4})-?([0-9]{4}$)";

   System.out.println("Insira um numero com () no DDD e -:");
        fonte=texto.nextLine();

        Pattern padrao = Pattern.compile(verificacao_t);
        Matcher match = padrao.matcher(fonte);

        if(match.find()){
            System.out.println("Padrao encontrado");
            if (fonte.length()==13){
                System.out.println("Eh telefone fixo");
            }
            else {
                System.out.println("Eh celular");
            }
        }else  {
            System.out.println("Padrao nao encontrado");

        }

        texto.close();




    }

}

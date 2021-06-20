package ex_semana2;
import java.util.Scanner;
public class ex_9 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int dep,  i = 0, aux ,  k = 1;
        float hrs , salB , salL, Tgasto = 0, Tdesc = 0, aux2;
        String nome;

        System.out.println("Entre com o numero total de funcionarios: ");
        aux = texto.nextInt();
        for (; i < aux; i++) {
            System.out.println("Insira o nome do " + k + "  funcionario : ");
            nome = texto.next();
            System.out.println(" Insira o numero de dependentes para o funcionario " + k);
            dep = texto.nextInt();
            System.out.println(" Insira o numero de horas trabalhadas para o funcionario " + k);
            hrs = texto.nextFloat();

            System.out.println(" O nome do " + k + " funcionario e :" + nome);
            salB = (float) (hrs * 100.00 + dep * 125.55);
            System.out.println(" O salario bruto do " + k + " funcionario e :" + salB);
            aux2 = (float) (salB * 0.12);
            salL = salB - aux2;
            System.out.println(" O salario liquido do " + k + " funcionario e :" + salL);
            System.out.println(" O valor descontado do " + k + " funcionário e :" + aux2);
            Tgasto = Tgasto + salB;
            Tdesc = Tdesc + aux2;
            k++;
        }
            System.out.println(" O total gasto com salarios e :" + Tgasto);
            System.out.println(" O total de funcionarios da empresa e :" + aux);
            System.out.println(" O total de descontos e :" + Tdesc);

            texto.close();

        }
    }



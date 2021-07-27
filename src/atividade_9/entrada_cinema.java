package atividade_9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class entrada_cinema {
    public Integer dataFilme;
public float horario;
public int sala;
public float valor;
    Scanner texto = new Scanner(System.in);
    public void iniciaAtrib(Integer dataFilme, float horario, int sala, float valor){
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }
    List<Object> lista = new ArrayList<>();
    public void calcularDescontoKids(){
        int anoAtual = 2021;
        System.out.println(" Insira a data de nascimento: ");
        int dataC = texto.nextInt();
        if(anoAtual - dataC < 12){
            double entrada = this.valor * .50;
            entrada = entrada + this.valor;
            lista.add(entrada);
            lista.add(": Com desconto infantil aplicado se possivel ");

        } }
    public void calcularDescontoEst(int dataNas, int numCarteira){
        int anoAtual=2021;
        String dadosIngresso="";
        if(anoAtual - dataNas >= 12 && anoAtual - dataNas<=15){
            double entrada = this.valor * .60;
            entrada = valor;
            dadosIngresso="Ingresso com 40% de desconto para estudantes com 12 a 15 anos no valor de: "+valor;
        }else if(anoAtual - dataNas >= 16&&anoAtual - dataNas<=20){
            double entrada = this.valor * .70;
            entrada = valor;
            dadosIngresso="Ingresso com 30% de desconto para estudantes com 16 a 20 anos no valor de: "+valor;
        }else if(anoAtual - dataNas >20){
            double entrada = this.valor * .80;
            entrada = valor;
            dadosIngresso="Ingresso com 20% de desconto para estudantes com 20 anos ou mais no valor de: "+valor;
        }
        lista.add(valor);
        lista.add(": Com desconto aplicado para estudantes se possivel ");
    }
    public void calcularDescontoHora(double horario) {
        String dadosIngresso = "";
        if (horario < 16) {
            double entrada = this.valor * .10;
            entrada = valor;
            dadosIngresso = "Ingresso com 10% de desconto pelo horário no valor de: " + valor;
        }
        lista.add(valor);
        lista.add(": Com desconto por horario aplicado se possivel");
    }


}



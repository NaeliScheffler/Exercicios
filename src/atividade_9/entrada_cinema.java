package atividade_9;
import javax.xml.crypto.Data;

public class entrada_cinema {
public String dataFilme;
public double hora;
public int sala;
public float valor;
public String dadosIngresso;
    public void iniciaAtrib(String dataFilme,double hora,int sala,float valor){
        this.dataFilme = dataFilme;
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
    }
    public double calcularDescontoKids(int dataNas){
        int anoAtual=2021;
        if(anoAtual - dataNas < 12){
            double entrada = this.valor * .50;
            entrada = valor;
        dadosIngresso="Ingresso com 50% de desconto para estudantes menores de 12 anos no valor de: "+valor;
        }
    return valor;
    }
    public double calcularDescontoEst(int dataNas,int numCarteira){
        int anoAtual=2021;
        if(anoAtual - dataNas >= 12&&anoAtual - dataNas<=15){
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
        return valor;
    }
    public double calcularDescontoHora(double horario){
        if(horario<16){
            double entrada = this.valor * .10;
            entrada = valor;
            dadosIngresso="Ingresso com 10% de desconto pelo horário no valor de: "+valor;
        }
        return valor;
    }



    public String toString(){
        return dadosIngresso;
    }
}



package atividade_11;

public class graduado extends ensinoMedio{
    public String universidade;
    public double taxa=2300;

    public double getRendaTotal(){
        return rendaBasica+taxa;
    }
}

package atividade_11;

public class ensinoBasico extends funcionarios {
    public String escolaB;
    public double taxa=100;

    public double getTaxa(){
        return taxa;
    }
    public double getRendaTotal() {
        return rendaBasica+taxa;
    }

}


package atividade_11;

import java.util.ArrayList;

public class ensinoMedio extends ensinoBasico {
    public String escolaM;
    public double taxa=650;

    public double getRendaTotal(){
        return rendaBasica+taxa;

    }
}

package atividade_11;

import java.util.ArrayList;

public class graduado extends ensinoMedio{
    public String universidade;
    public double taxa=2300;

    public double getRendaTotal(){
        return rendaBasica+taxa;
    }
}

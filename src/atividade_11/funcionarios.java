package atividade_11;

import java.util.ArrayList;

public class funcionarios extends  empresa {
        public String nome;
        public int cod;
        public  double rendaBasica = 1000;
        public double taxa;

    public double getRendaTotal(){
        return rendaBasica+taxa;
    }
    }
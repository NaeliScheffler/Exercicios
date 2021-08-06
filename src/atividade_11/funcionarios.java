package atividade_11;

import java.util.ArrayList;

public class funcionarios extends  empresa {
    public String nome;
    public int cod;
    public double rendaBasica = 1000;
    public double taxa;

    public double gastoTotal;

    public double getRendaTotal() {
        return rendaBasica + taxa;
    }

    public void gastoTotal() {
        for (funcionarios f : qtdFunc) {
            gastoTotal += f.getRendaTotal();
        }
        System.out.println(gastoTotal);
    }


}
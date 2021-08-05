package atividade_11;

import java.util.ArrayList;

public class empresa {
    public ArrayList<funcionarios> qtdFunc = new ArrayList<>();
    public double gastoTotal;

    public void contratarFuncionario(funcionarios f) {
        qtdFunc.add(f);
    }

    public void gastoTotal() {
        for (funcionarios f : qtdFunc) {
            gastoTotal += f.getRendaTotal();
        }
        System.out.println(gastoTotal);
    }
}



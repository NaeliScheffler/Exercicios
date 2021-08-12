package atividade_12;

public class desc1 extends descontador {
    public void desconto() {
        if (setor == "fruteira" && getHora() >= 20) {
            percentualDesconto = (float) (valorUnitario * 0.1);
        }

    }
}

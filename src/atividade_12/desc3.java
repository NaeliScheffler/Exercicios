package atividade_12;

public class desc3 extends descontador {
    public void desconto(){
        if (quantidade>=10&&setor=="Bebidas"){
            percentualDesconto= (float) (valorUnitario*0.2);
        }
    }
}

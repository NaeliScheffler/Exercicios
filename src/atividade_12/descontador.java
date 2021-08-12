package atividade_12;

public class descontador extends pedidos {
    public pedidos pedido;
    public double valorDesconto;

    public void descontador(pedidos pedido,double valorDesconto){
        this.pedido=pedido;
        this.valorDesconto=valorDesconto;
    }

}

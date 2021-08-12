package atividade_12;


public class descontador extends pedidos {
    public pedidos pedido;
    public double valorDesconto;

    public void setPedido(pedidos pedido){
        this.pedido=pedido;
    }

    public double getValorDesconto(){
        return valorDesconto;
    }

    public void descontar(itensProduto item){
        for(itensProduto i:itens){
            for(horarioCompra h:horas){
                if(i.getSetor().equals("Fruteira") &&h.getHora()>=20){
                   valorDesconto=(i.getValorUnitario()*0.1);
                }
                if(h.getDia().equals("Segunda") && i.getSetor().equals("Acougue")){
                    valorDesconto=valorDesconto+(i.getValorUnitario()*0.15);
                }
                if (i.getQuantidade()>=10&& i.getSetor().equals("Bebidas")){
                    valorDesconto=valorDesconto+(i.getValorUnitario()*0.2);
                }
            }
        }
    }

}

package atividade_12;


public class descontador  {
    public pedidos pedido;
    public double desconto;



    public descontador(pedidos pedido) {
        this.pedido = pedido;
    }

    public descontador() {

    }

    public pedidos  getPedido() {
        return pedido;
    }
    public void setPedido(pedidos pedido){
        this.pedido=pedido;
    }

    public void descontar(){
        double desconta=0;
        for (itensProduto prod: pedido.getItem()){
            if(prod.getSetor().equalsIgnoreCase("Fruteira")&&pedido.getHoras().getHora()>20){
                prod.percentualDesconto=0.10;
            }
            else if(prod.getSetor().equalsIgnoreCase("Acougue")&&pedido.getHoras().getDia().equalsIgnoreCase("Segunda")){
                prod.percentualDesconto=0.15;
        }
        else if(prod.getSetor().equalsIgnoreCase("Bebidas")&&prod.getQuantidade()>=10){
                prod.percentualDesconto=0.20;
        }
    }
        pedido.calculaPrecoFinal();
        }
    public String toString() {
        return String.format("\nValor de desconto: %. 2f ", desconto);


    }
    }



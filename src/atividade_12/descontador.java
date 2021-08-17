package atividade_12;


public class descontador  {
    public pedidos pedido;
    public itensProduto prod;

    public void descontador(pedidos pedido) {
        this.pedido = pedido;
    }
    public pedidos  getPedido() {
        return pedido;
    }
    public void setPedido(pedidos pedido){
        this.pedido=pedido;
    }

    public double descontar(){
        double desconta=0;
        for (int i=0;i<pedido.getItem().size();i++){
            if(prod.getSetor().equalsIgnoreCase("Fruteira")&&pedido.getHoras().getHora()>20){
                desconta=0.10*(prod.getQuantidade()*prod.getValorUnitario());
            }
            else if(prod.getSetor().equalsIgnoreCase("Acougue")&&pedido.getHoras().getDia().equalsIgnoreCase("Segunda")){
           desconta=0.15*(prod.getQuantidade()*prod.getValorUnitario());
        }
        else if(prod.getSetor().equalsIgnoreCase("Bebidas")&&prod.getQuantidade()<=10){
            desconta=  0.20*(prod.getQuantidade()*prod.getValorUnitario());
        }
    }
        return desconta;
        }



    }



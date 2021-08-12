package atividade_12;

public class exe {
    public static void main(String[] args) {
        itensProduto i1=new itensProduto(10," Suco de laranja","Bebidas",11,0,11);
        itensProduto i2=new itensProduto(20," carne","Acougue",3,0,1);
        itensProduto i3=new itensProduto(30," Detergente","Limpeza",2,0,1);
        horarioCompra h1=new horarioCompra("Segunda",14,30);
        pedidos p1=new pedidos();
        descontador d1=new descontador();
        d1.setPedido(p1);
        d1.getValorDesconto();
        p1.itens.add(i1);
        p1.itens.add(i2);
        p1.itens.add(i3);
        p1.imprimeNota();
        p1.calculaPrecoFinal();
        p1.imprimeNota();

    }
}

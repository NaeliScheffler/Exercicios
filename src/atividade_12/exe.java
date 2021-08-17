package atividade_12;


public class exe {
    public static void main(String[] args) {
        itensProduto i1=new itensProduto(10," Suco de laranja","Bebidas",11,0,11);
        itensProduto i2=new itensProduto(20," carne","Acougue",3,0,1);
        itensProduto i3=new itensProduto(30," Detergente","Limpeza",2,0,1);
        horarioCompra h1=new horarioCompra("Segunda",14,30);
        pedidos p1 =new pedidos(i1,h1);
        p1.setItemProduto(i1);
        p1.setItemProduto(i2);
        p1.imprimeNota();

    }
}

package atividade_12;


import java.util.ArrayList;

public class exe {
    public static void main(String[] args) {
        itensProduto i1=new itensProduto(10," Suco de laranja","Bebidas",11,0,11);
        itensProduto i2=new itensProduto(20," carne","Acougue",3,0,1);
        itensProduto i3=new itensProduto(30," Detergente","Limpeza",2,0,1);
        horarioCompra h1=new horarioCompra("Segunda",14,30);
        ArrayList<itensProduto> item=new ArrayList<>();
        item.add(i1);
        item.add(i2);
        item.add(i3);
        pedidos p1=new pedidos(item,h1,null);
        p1.calculaPrecoFinal();
        descontador desconta=new descontador(p1);
        desconta.descontar();
        p1.imprimeNota();
    }
}

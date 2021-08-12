package atividade_12;

public class exe {
    public static void main(String[] args) {
        itensProduto i1=new itensProduto();
        itensProduto i2=new itensProduto();
        itensProduto i3=new itensProduto();
        horarioCompra h1=new horarioCompra();
        pedidos p1=new pedidos();
        desc1 d1=new desc1();
        i1.itensProduto(10," Suco de laranja","Bebidas",11,0,11);
        i2.itensProduto(20," carne","Acougue",3,0,1);
        i3.itensProduto(30," Detergente","Limpeza",2,0,1);
        h1.horarioCompra("Segunda",14,30);
        p1.horas="Terca,"+" 14:"+"30";
        p1.itens.add(i1);
        p1.itens.add(i2);
        p1.itens.add(i3);
        p1.imprimeNota();
        p1.descontar(d1);
        p1.calculaPrecoFinal();
        p1.imprimeNota();

    }
}

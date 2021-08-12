package atividade_12;

import java.util.ArrayList;


public class pedidos extends itensProduto {
    public ArrayList<itensProduto> itens=new ArrayList<>();
    public String horas;
    public double valorFinal;


    public void calculaPrecoFinal(){
        for(itensProduto i:itens){
            valorFinal=valorFinal+i.getValorUnitario()*i.getQuantidade()-i.getPercentualDesconto();
        }
        System.out.println("\n Preco final da compra: \n"+valorFinal);
    }
    public void imprimeNota(){
        for(itensProduto i:itens){
            System.out.println("\n Cod: "+i.getCodigo()+"\n Descricao: "+i.getDescricao()+"\n Setor: "+i.getSetor()+"\n Valor unitario: "+i.getValorUnitario()+"\n Desconto: "+i.getPercentualDesconto()+"\n Quantidade: "+i.getQuantidade());
        }
        System.out.println("\n Valor final: "+valorFinal);
        System.out.println("\n Horario: "+horas);
    }

    public void descontar(descontador d){
        for(itensProduto i:itens){
                if(i.getSetor()=="fruteira"&&i.getHora()>=20){
                    percentualDesconto= (float) (valorUnitario*0.1);
                }
                if(i.getDia()=="Segunda"&& i.getSetor()=="Acougue"){
                    percentualDesconto= (float) (valorUnitario*0.15);
                }
                if (i.getQuantidade()>=10&&i.getSetor()=="Bebidas"){
                    percentualDesconto= (float) (valorUnitario*0.2);
                }
        }
    }
}

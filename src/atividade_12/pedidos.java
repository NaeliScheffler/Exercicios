package atividade_12;

import java.util.ArrayList;


public class pedidos  {
    public ArrayList<itensProduto> itens=new ArrayList<>();
    public ArrayList<horarioCompra> horas=new ArrayList<>();
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


}

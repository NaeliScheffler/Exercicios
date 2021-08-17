package atividade_12;


import java.util.ArrayList;

public class pedidos  {
    public ArrayList<itensProduto> itens;
    public horarioCompra horas;
    public double valorFinal;
    public descontador desconto;

    public pedidos( ArrayList<itensProduto> itens,horarioCompra horas, descontador desconto){
        super ();
        this.itens=itens;
        this.horas=horas;
        this.desconto=desconto;
    }
    public ArrayList<itensProduto> getItem(){
        return itens;
    }
    public void setItemProduto(itensProduto itens){
        this.itens.add(itens);
    }
    public horarioCompra getHoras(){
        return horas;
    }
    public  void  setHoras(horarioCompra horas){
       this.horas = horas;
    }
    public  double  getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal){
        this.valorFinal=valorFinal;
    }
    public  descontador  getDesconto () {
        return desconto;
    }

    public  void  setDesconto( descontador  desconto ) {
        this.desconto=desconto;
    }


    public double calculaPrecoFinal(){
        double aux=0;
        for(itensProduto i:itens){
            double aux2=0;
            aux2=i.getValorUnitario()*i.getQuantidade();
            aux+=aux2-(aux2*i.getPercentualDesconto());
        }
        this.valorFinal=aux;
        return valorFinal;
    }
    public void imprimeNota(){
        for(itensProduto i:itens){
            System.out.println("\nCod: "+i.getCodigo()+"\nDescricao: "+i.getDescricao()+"\nSetor: "+i.getSetor()+"\nValor unitario: "+i.getValorUnitario()+"\nDesconto: "+i.getPercentualDesconto()+"\nQuantidade: "+i.getQuantidade());
        }
        System.out.println("\nValor final: "+valorFinal);
        System.out.println("\nHorario: "+horas);
    }


}

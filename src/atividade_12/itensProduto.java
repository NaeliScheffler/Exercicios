package atividade_12;

public class itensProduto extends horarioCompra {
    public int codigo;
    public  String descricao;
    public String setor;
    public double valorUnitario;
    public float percentualDesconto;
    public int quantidade;

    public void itensProduto(int codigo,String descricao,String setor,double valorUnitario,float percentualDesconto,int quantidade){
        this.codigo=codigo;
        this.descricao=descricao;
        this.setor=setor;
        this.valorUnitario=valorUnitario;
        this.percentualDesconto=percentualDesconto;
        this.quantidade=quantidade;
    }



    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getSetor(){
        return setor;
    }
    public double getValorUnitario(){
        return valorUnitario;
    }
    public float getPercentualDesconto(){
        return percentualDesconto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setSetor(String setor){
        this.setor=setor;
    }
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario=valorUnitario;
    }
    public void setPercentualDesconto(int percentualDesconto){
        this.percentualDesconto=percentualDesconto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }

    }


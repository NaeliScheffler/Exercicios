package atividade_10;

public class pessoas {
    public String nome;
    public String tipo;

    public  String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public void imprime(){
        System.out.println(" O nome da pessoa eh: " + this.nome);
        System.out.println(" O cargo da pessoa eh: " + this.tipo);
    }


}

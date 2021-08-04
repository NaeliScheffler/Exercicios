package atividade_10;

public class _1pessoas extends _1escola {
    public String nome;


    public  String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }


    public void imprime(){
        System.out.println(" O nome da pessoa eh: " + this.nome);

    }


}

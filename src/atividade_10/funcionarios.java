package atividade_10;

public class funcionarios {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public double getsalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public double bonifica(){
        return this.salario*0.1;
    }

    public void mostraDados(){
        System.out.println("Nome :\n"+getNome());
        System.out.println("Salario :\n"+getsalario());
        System.out.println("Bonificacao :\n"+bonifica());
    }
}

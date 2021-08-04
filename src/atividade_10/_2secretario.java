package atividade_10;

public class _2secretario extends _2funcionarios{
    private int ramal;

    public int getRamal(){
        return ramal;
    }
    public void setRamal(int ramal){
        this.ramal=ramal;
    }
    public void mostraDados(){
        System.out.println("Nome :\n"+getNome());
        System.out.println("Salario :\n"+getsalario());
        System.out.println("Bonificacao :\n"+bonifica());
    }
}

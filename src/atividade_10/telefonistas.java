package atividade_10;

public class telefonistas extends funcionarios {
    private int codEstacao;

    public int getCodEstacao(){
        return codEstacao;
    }
    public void setCodEstacao(int codEstacao) {
        this.codEstacao = codEstacao;
    }
        public void mostraDados(){
            System.out.println("Nome :\n"+getNome());
            System.out.println("Salario :\n"+getsalario());
            System.out.println("Bonificacao :\n"+bonifica());
        }
    }


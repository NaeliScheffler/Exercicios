package atividade_10;

public class gerentes extends funcionarios {
    private String nomeUsuario;
    private String senha;

    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario=nomeUsuario;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
        public double bonifica(){
            return this.getsalario()*0.6+100;
        }
    public void mostraDados(){
        System.out.println("Nome :\n"+getNome());
        System.out.println("Salario :\n"+getsalario());
        System.out.println("Bonificacao :\n"+bonifica());
    }

}

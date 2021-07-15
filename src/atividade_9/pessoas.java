package atividade_9;

public class pessoas {
    public String nome;
    public String pai;
    public String mae;

    public pessoas(String nome) {
        this.nome = nome;
        this.mae = null;
        this.pai = null;
    }
    public pessoas(String nome, String pai, String mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNomep() {
        return nome;
    }
    public void setNomep(){
        this.nome=nome;
    }
    public String getMae() {
        return mae;
    }
    public void setMae(){
        this.mae=mae;
    }
    public String getPai() {
        return pai;
    }
    public void setPai(){
        this.pai=pai;
    }

    public String ehmesmaP(pessoas outraPessoa) {
        String mesmap = "";
        if (this.nome.equals(outraPessoa.getNomep())) {
            if (this.mae.equals(outraPessoa.getMae())){
                 mesmap="true";
                return mesmap;
        }
        }
        else {
             mesmap="false";
        }
      return mesmap;
    }
    public String ehIrma(pessoas outraPessoa) {
        String irma="";
        if (this.mae.equals(outraPessoa.getMae())) {
            if (this.pai.equals(outraPessoa.getPai())){
                irma="true";
            }
        } else
        {
            irma="false";
        }
        return irma;
    }

public String antecess(pessoas outraPessoa){
        if (this.nome.mae)
}
}
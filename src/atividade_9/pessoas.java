package atividade_9;

public class pessoas {
    public String nome;
    public String pai;
    public String mae;
    public String antecessor;
    public String avM;
    public String vM;
    public String avP;
    public String vP;

    public pessoas(String nome) {
        this.nome = nome;
        this.mae = null;
        this.pai = null;
        this.avM = null;
        this.vM = null;
        this.avP = null;
        this.vP=null;

    }
    public void pessoasAdd(String nome, String pai, String mae, String avM, String vM, String avP, String vP) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.avM = avM;
        this.vM = vM;
        this.avP = avP;
        this.vP = vP;
        this.antecessor=mae+pai+avM+vM+avP+vP;
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

    public String ehIrma(  pessoas outraPessoa) {
        String irma="";
        if (this.mae.equals(outraPessoa.getMae())){
            if (this.pai.equals(outraPessoa.getPai())){
                irma="true";
            }
        } else
        {
            irma="false";
        }
        return irma;
    }

public void antecess(String nome, String outroNome){
        if (this.antecessor.contains(outroNome)){
            System.out.println("\n Eh antecessor \n");
        }else{
            System.out.println("\n Nao eh antecessor \n");
        }
}
}
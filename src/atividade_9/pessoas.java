package atividade_9;

public class pessoas {
    public String nome;
    public pessoas pai;
    public pessoas mae;


    public pessoas(String nome,pessoas pai,pessoas mae) {
        this.nome=nome;
        this.pai=pai;
        this.mae=mae;
    }



    public String getNomep() {

        return nome;
    }
    public void setNomep(){
    this.nome=nome;
    }
    public pessoas getMae() {

        return mae;
    }
    public void setMae(){

        this.mae=mae;
    }
    public pessoas getPai() {

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

public void antecess( pessoas outroNome){
        if(getPai()==outroNome){
            System.out.println("\n Eh seu pai. \n");
        }
    if(getMae()==outroNome){
        System.out.println("\n Eh sua mae. \n");
    }
    if(pai.getPai()==outroNome){
        System.out.println("\n Eh seu avo \n");
    }
    if(pai.getMae()==outroNome){
        System.out.println("\n Eh sua avo \n");
    }
    if(mae.getPai()==outroNome){
        System.out.println("\n Eh seu avo \n");
    }
    if(mae.getMae()==outroNome){
        System.out.println("\n Eh sua avo \n");
    }
}
}
package atividade_9;

public class pessoas {
    public String nome;
    public pessoas pai;
    public pessoas mae;

    public String getNomep() {
        return nome;
    }

    public void setNomep(String nome) {
        this.nome = nome;
    }

    public pessoas getMae() {
        return mae;
    }

    public void setMae(pessoas mae) {
        this.mae = mae;
    }

    public pessoas getPai() {
        return pai;
    }

    public void setPai(pessoas pai) {
        this.pai = pai;
    }

    public void ehmesmaP(pessoas outraPessoa) {
        if (this.nome.equals(outraPessoa.getNomep())) {
            if (this.mae.equals(outraPessoa.getMae())) {
                System.out.println(" Eh a mesma pessoa ");
            }
        } else {
            System.out.println(" Nao eh a mesma pessoa ");
        }
    }



    public void ehIrma(pessoas outraPessoa) {
        if (this.mae.equals(outraPessoa.getMae())) {
            if (this.pai.equals(outraPessoa.getPai())) {
                System.out.println(" Eh irma ");
            }
        } else {
            System.out.println(" Nao eh irma ");
        }
    }

    public void antecess(pessoas outroNome) {
        if (getPai() == outroNome) {
            System.out.println(" Eh seu pai ");
        }
        if (getMae().pai == outroNome) {
            System.out.println(" Eh seu avo ");
        }
        if (getMae() == outroNome) {
            System.out.println(" Eh sua mae");
        }
        if (getMae().mae == outroNome) {
            System.out.println(" Eh sua avo ");
        }


    }
}
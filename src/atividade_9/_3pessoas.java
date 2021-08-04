package atividade_9;

public class _3pessoas {
    public String nome;
    public _3pessoas pai;
    public _3pessoas mae;

    public String getNomep() {
        return nome;
    }

    public void setNomep(String nome) {
        this.nome = nome;
    }

    public _3pessoas getMae() {
        return mae;
    }

    public void setMae(_3pessoas mae) {
        this.mae = mae;
    }

    public _3pessoas getPai() {
        return pai;
    }

    public void setPai(_3pessoas pai) {
        this.pai = pai;
    }

    public void ehmesmaP(_3pessoas outraPessoa) {
        if (this.nome.equals(outraPessoa.getNomep())) {
            if (this.mae.equals(outraPessoa.getMae())) {
                System.out.println(" Eh a mesma pessoa ");
            }
        } else {
            System.out.println(" Nao eh a mesma pessoa ");
        }
    }



    public void ehIrma(_3pessoas outraPessoa) {
        if (this.mae.equals(outraPessoa.getMae())) {
            if (this.pai.equals(outraPessoa.getPai())) {
                System.out.println(" Eh irma ");
            }
        } else {
            System.out.println(" Nao eh irma ");
        }
    }

    public void antecess(_3pessoas outroNome) {
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
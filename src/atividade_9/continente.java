package atividade_9;

public class continente {
    public String nome;
    public pais[] paises;
    public int qtpaises;
    public double totalDimensao;
    public int totalPessoas;
    public double densidade;
    public Integer maiorP;
    public Integer menorP;


    public void continenteNome(String nome) {
        this.nome = nome;
        this.paises = new pais[30];
    }

    public void continentePais(String paises) {
        this.nome = nome;
        this.paises = new pais[40];
        qtpaises = 0;
    }

    public void addPais(pais pais) {
        this.paises[qtpaises] = pais;
        this.qtpaises++;
        this.totalDimensao = this.totalDimensao + pais.getDimensao();
        this.totalPessoas = this.totalPessoas + pais.getPop();
        this.densidade = this.totalPessoas / this.totalDimensao;

        this.maiorP = paises[0].getPop();


        this.menorP = paises[0].getPop();


    }

    public double gettotalp() {
        return totalPessoas;
    }

    public double getTotalDimensao() {
        return totalDimensao;
    }

    public double densidade() {
        return totalPessoas / totalDimensao;
    }


    public double maiorpopula() {
        return maiorP;

    }

    public double menorpopula() {
        return menorP;

    }
}



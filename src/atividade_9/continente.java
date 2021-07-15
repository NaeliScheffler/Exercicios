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


        public void continenteNome (String nome){
            this.nome = nome;
            this.paises = new pais[30];
        }
        public void continentePais (String nome){
            this.nome = nome;
            this.paises = new pais[40];
            qtpaises = 0;
        }
        public void addPais (pais pais){
            this.paises[qtpaises] = pais;
            this.qtpaises++;
            this.totalDimensao = this.totalDimensao + pais.getDimensao();
            this.totalPessoas = this.totalPessoas + pais.getPop();
            this.densidade = this.totalPessoas / this.totalDimensao;

            this.maiorP = paises[0].getPop();


            this.menorP = paises[0].getPop();


        }
    public double gettotalp () {
        return totalPessoas;
    }

        public double getTotalDimensao () {
            return this.totalDimensao;
        }
public double densidade(){
            return totalPessoas/totalDimensao;
}


    public Integer maiorPop (pais pais ){
            Integer maiorpop = 0;
            for (atividade_9.pais p : paises) {
                if (pais.pop <= pais.pop) {
                    maiorpop = pais.pop;
                }
            }
            return maiorpop;
        }

    }



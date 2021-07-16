package atividade_9;

public class continente {
    public String nome;
    public pais[] paises;
    public int qtpaises=0;
    public int totalPessoas;
    public double totalDimensao;
    public double densidade;
    public double paisD[];
    public double paisP[];
    public double maiorP;
    public double menorP;
    public double maiorD;
    public double menorD;



        public void continenteNome(String nome) {
            this.nome = nome;
            this.paises = new pais[30];
        }

        public void continentePais(String paises, Double dimensao, Double populacao) {
            this.paises = new pais[40];
            this.paisD[qtpaises] = dimensao;
            this.paisP[qtpaises] = populacao;
            this.qtpaises++;
            this.totalDimensao = this.totalDimensao + paisD[qtpaises];
            this.totalPessoas = (int) (this.totalPessoas + paisP[qtpaises]);
            this.densidade = this.totalPessoas / this.totalDimensao;
            if (maiorP < paisP[qtpaises]) {
                maiorP = paisP[qtpaises];
            }
            if (menorP > paisP[qtpaises]) {
                menorP=paisP[qtpaises];
            }
            if (maiorD < paisD[qtpaises]) {
                maiorD=paisD[qtpaises];
            }
            if (menorD > paisD[qtpaises]) {
                menorD=paisD[qtpaises];
            }
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


        public double maiorPopula() {
            return maiorP;

        }

        public double menorPopula() {
            return menorP;
        }
        public double menorDimen() {
                return menorD;

        }
        public double maiorDimen() {
        return maiorD;

    }
    public double razaoMaior(){
            return maiorD/menorD;
    }

}



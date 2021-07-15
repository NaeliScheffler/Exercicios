package atividade_9;

import java.util.ArrayList;

public class continente {
    public String nome;
    private Pais[] paises;
    private int qtpaises;
    private double totalDimensao;
    private int totalPessoas;
    private double densidade;
    private Integer maiorP;
    private Integer menorP;


        public void continenteNome (String nome){
            this.nome = nome;
            this.paises = new Pais[30];
        }
        public void continentePais (String nome){
            this.nome = nome;
            this.paises = new Pais[40];
            qtpaises = 0;
        }
        public void addPais (Pais pais){
            this.paises[qtpaises] = pais;
            this.qtpaises++;
            this.totalDimensao = this.totalDimensao + pais.getDimensao();
            this.totalPessoas = this.totalPessoas + pais.getPop();
            this.densidade = this.totalPessoas / this.totalDimensao;

            this.maiorP = paises[0].getPop();


            this.menorP = paises[0].getPop();


        }
    public double gettotalp () {
        return this.totalPessoas;
    }

        public double getTotalDimensao () {
            return this.totalDimensao;
        }




    public Integer maiorPop (Pais pais ){
            Integer maiorpop = 0;
            for (Pais p : paises) {
                if (pais.pop <= pais.pop) {
                    maiorpop = pais.pop;
                }
            }
            return maiorpop;
        }

    }



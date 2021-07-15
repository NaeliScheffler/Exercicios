package atividade_9;
import java.util.ArrayList;


    class Pais {
        public String codigoIso;
        public String nome;
        public Integer pop;
        public Double dimensao;
        public ArrayList<Pais> paisFronteira = new ArrayList<Pais>();

        public Pais(String codigoIso, String nome, Double dimensao) {
            this.codigoIso = codigoIso;
            this.nome = nome;
            this.dimensao = dimensao;
        }

        public String getCodigoIso() {
            return codigoIso;
        }

        public void setCodigoIso(String codigoIso) {
            this.codigoIso = codigoIso;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getPop() {
            return pop;
        }

        public void setPop(Integer pop) {
            this.pop = pop;
        }

        public Double getDimensao() {
            return dimensao;
        }

        public void setDimensao(Double dimensao) {
            this.dimensao = dimensao;
        }

        public boolean ehOMesmoPais(Pais outroPais){
            if( this.codigoIso.equals(outroPais.getCodigoIso())){
                return true;
            }else{
                return false;
            }
        }

        public boolean ehLimitrofe(Pais outroPais){
            if( this.paisFronteira.contains(outroPais) ){
                return true;
            }else{
                return false;
            }
        }

        public ArrayList<Pais> vizinhosComuns(Pais outroPais){
            ArrayList<Pais> comuns = new ArrayList<Pais>();
            for(Pais p : this.paisFronteira){
                if( outroPais.ehLimitrofe(p) ){
                    comuns.add(p);
                }
            }
            return comuns;
        }
        public double getDensidadePopulacional(){
            return this.getPop() / this.getDimensao();

        }

    }


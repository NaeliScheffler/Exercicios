package atividade_9;
import java.util.ArrayList;


    public class pais {
        public String codigoIso;
        public String nome;
        public Integer pop;
        public Double dimensao;
        public ArrayList<pais> paisFronteira = new ArrayList<>();

        public pais(String codigoIso, String nome, Double dimensao) {
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

        public  Integer getPop() {
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

        public boolean ehOMesmoPais(pais outroPais){
            return this.codigoIso.equals(outroPais.getCodigoIso());
        }

        public boolean ehLimitrofe(pais outroPais){
            return this.paisFronteira.contains(outroPais);
        }

        public ArrayList<pais> vizinhosComuns(pais outroPais){
            ArrayList<pais> comuns = new ArrayList<>();
            for(pais p : this.paisFronteira){
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


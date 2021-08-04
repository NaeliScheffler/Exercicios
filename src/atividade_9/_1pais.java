package atividade_9;
import java.util.ArrayList;


    public class _1pais {
        public String codigoIso;
        public String nome;
        public Integer pop;
        public Double dimensao;
        public ArrayList<_1pais> paisFronteira = new ArrayList<>();

        public _1pais(String codigoIso, String nome, Double dimensao) {
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

        public boolean ehOMesmoPais(_1pais outroPais){
            return this.codigoIso.equals(outroPais.getCodigoIso());
        }

        public boolean ehLimitrofe(_1pais outroPais){
            return this.paisFronteira.contains(outroPais);
        }

        public ArrayList<_1pais> vizinhosComuns(_1pais outroPais){
            ArrayList<_1pais> comuns = new ArrayList<>();
            for(_1pais p : this.paisFronteira){
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


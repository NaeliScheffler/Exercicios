package atividade_9;
import java.util.ArrayList;


    public class pais {
        public String codigoIso;
        public String nome;
        public Integer pop;
        public Double dimensao;
        public ArrayList<pais> paisFronteira = new ArrayList<pais>();

        public pais(String codigoIso, String nome, Double dimensao) {
            this.codigoIso = codigoIso;
            this.nome = nome;
            this.dimensao = dimensao;
            this.pop=pop;

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
            if( this.codigoIso.equals(outroPais.getCodigoIso())){
                return true;
            }else{
                return false;
            }
        }

        public boolean ehLimitrofe(pais outroPais){
            if( this.paisFronteira.contains(outroPais) ){
                return true;
            }else{
                return false;
            }
        }

        public ArrayList<pais> vizinhosComuns(pais outroPais){
            ArrayList<pais> comuns = new ArrayList<pais>();
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


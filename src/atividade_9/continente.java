package atividade_9;
import java.util.ArrayList;
class Continente {
    public String nome;
    public ArrayList<pais> listaPais = new ArrayList<>();

    public Continente(){}
    public Continente(String nome) {
        this.nome = nome;

    }
    public void adicionaPais(pais Pais) {
        listaPais.add(Pais);
    }
    public double getDimensaoTotal() {
        double total = 0;
        for(pais p : listaPais) {
            total += p.getDimensao();
        }
        return total;
    }
    public double getPopulacaoTotal() {
        double total = 0;

        for(pais p : listaPais) {
            total += p.getPop();
        }
        return total;
    }
    public String maiorPop(){
        double total=0;
        double maiorPop=0;
        String maior="";
        for (pais p : listaPais){
            total=p.getPop();
            if(maiorPop<=total){
                maiorPop=total;
            }
            maior=p.getNome();
        }
        return maior;
    }

}

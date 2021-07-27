package atividade_9;
import java.util.ArrayList;
class Continente {
    private String nome;
    public ArrayList < pais > listaPais = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList < pais > getPaises() {
        return listaPais;
    }

    public void setPaises(ArrayList < pais > listaPais) {
        this.listaPais = listaPais;
    }
    public void dimensao() {
        double dimensaoTotal = 0;
        for (pais p: listaPais) {
            dimensaoTotal += p.getDimensao();
        }
        System.out.println(" Dimensao total do continente: " + dimensaoTotal);
    }

    public void populacao() {
        int popTotal = 0;
        for (pais p: listaPais) {
            popTotal += p.getPop();
        }
        System.out.println(" População total do continente: " + popTotal);
    }

    public void densidadeP() {
        int popTotal = 0;
        double dimensaoTotal = 0;
        for (pais p: listaPais) {
            popTotal += p.getPop();
            dimensaoTotal += p.getDimensao();
        }
        System.out.println(" Densidade populacional: " + popTotal / dimensaoTotal);
    }

    public void maiorPop() {
        int i = 0;
        int j = 0;
        int pop = 0;
        for (; i < this.listaPais.size(); i++) {
            if (this.listaPais.get(i).getPop() > pop) {
                j = i;
                pop = this.listaPais.get(i).getPop();
            }
        }
        System.out.println(" Pais que possui a  maior população: " + this.listaPais.get(j).getNome() + " Possui: " + this.listaPais.get(j).getPop());
    }

    public void menorPop() {
        int i = 0;
        int j = 0;
        int pop = 0;
        for (; i < this.listaPais.size(); i++) {
            if (this.listaPais.get(i).getPop() < pop || i == 0) {
                j = i;
                pop = this.listaPais.get(i).getPop();
            }
        }
        System.out.println(" Pais que possui menor população: " + this.listaPais.get(j).getNome() + " Possui: " + this.listaPais.get(j).getPop());
    }

    public void maiorDimensao() {
        int i = 0;
        int j = 0;
        double dimensao = 0;
        for (; i < this.listaPais.size(); i++) {
            if (this.listaPais.get(i).getDimensao() > dimensao) {
                j = i;
                dimensao = this.listaPais.get(i).getDimensao();
            }
        }
        System.out.println(" Pais com a maior dimensao: " + this.listaPais.get(j).getNome() + " Possui: " + this.listaPais.get(j).getDimensao());
    }

    public void menorDimensao() {
        int i = 0;
        int j = 0;
        double dimensao = 0;
        for (; i < this.listaPais.size(); i++) {
            if (this.listaPais.get(i).getDimensao() < dimensao || i == 0) {
                j = i;
                dimensao = this.listaPais.get(i).getDimensao();
            }
        }
        System.out.println(" Pais com a menor dimensao: " + this.listaPais.get(j).getNome() + " Possui " + this.listaPais.get(j).getDimensao());
    }

    public void razaoTerritorial() {
        int maior = 0;
        int menor = 0;
        double maiorDimensao = 0;
        double menorDimensao = 0;
        for (int i = 0; i < this.listaPais.size(); i++) {
            if (this.listaPais.get(i).getDimensao() < menorDimensao || i == 0) {
                menor = i;
                menorDimensao = this.listaPais.get(i).getDimensao();
            }
            if (this.listaPais.get(i).getDimensao() > maiorDimensao || i == 0) {
                maior = i;
                maiorDimensao = this.listaPais.get(i).getDimensao();
            }
        }
        double x = this.listaPais.get(maior).getDimensao() / this.listaPais.get(menor).getDimensao();
        System.out.println(" A diferença entre os territorios eh: " + this.listaPais.get(maior).getNome() + " para " + this.listaPais.get(menor).getNome() + " : " + x);
    }

}
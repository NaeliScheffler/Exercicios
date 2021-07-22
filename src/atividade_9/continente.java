package atividade_9;
import java.util.ArrayList;
public class continente {
    public String nome;
    public ArrayList<pais> listaPais = new ArrayList<pais>();


    public continente(String nome) {
        this.nome = nome;
    }

    public void addPais(ArrayList listaPais) {
        this.listaPais = listaPais;
    }

    public void dimensaoC() {
        double dimensaoP = 0;
        for (int i = 0; i < listaPais.size(); i++) {
            System.out.println();
        }
    }
}
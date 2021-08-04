package atividade_11;

import atividade_9._1pais;

import java.util.ArrayList;

public class funcionarios extends  empresa {
    public String nome;
    public String codFuncional;
    public double comissoes;
    public float rendaBasica=1000;
    ArrayList<funcionarios> funcionario=new ArrayList<funcionarios>();
    ArrayList<Double> rendaT=new ArrayList<Double>();
    ArrayList<Double> rendaB=new ArrayList<Double>();
    ArrayList<Double> rendaM=new ArrayList<Double>();
    ArrayList<Double> rendaG=new ArrayList<Double>();

    public void addFuncionario(funcionarios f1){
        funcionario.add(f1);

    }
    public ArrayList<Double> getRendaT(){
        return rendaT;
    }
    public void gastoTotal() {
        double dimensaoTotal = 0;
        for (funcionarios f: funcionario) {
            dimensaoTotal=dimensaoTotal + f.getRendaT();
        }
        System.out.println(" Total de gastos: " + dimensaoTotal);
    }
    public double gastoBasico(){
        double tRenda=0;
        for (int i = 0; i < rendaB.size(); i++) {
            tRenda += rendaB.get(i);

        }
        return tRenda;
    }
    public double gastoMedio(){
        double tRenda=0;
        for (int i = 0; i < rendaM.size(); i++) {
            tRenda += rendaM.get(i);

        }
        return tRenda;
    }
    public double gastoGraduado(){
        double tRenda=0;
        for (int i = 0; i < rendaG.size(); i++) {
            tRenda += rendaG.get(i);

        }
        return tRenda;
    }

}

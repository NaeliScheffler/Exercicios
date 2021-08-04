package atividade_11;

import atividade_9._1pais;

import java.util.ArrayList;

public class empresaEx {
    public static void main(String[] args) {
        funcionarios f1=new funcionarios();
        ensinoBasico e1=new ensinoBasico();
        ensinoBasico e2=new ensinoBasico();
        ensinoBasico e3=new ensinoBasico();
        ensinoBasico e4=new ensinoBasico();
        ensinoMedio e5=new ensinoMedio();
        ensinoMedio e6=new ensinoMedio();
        ensinoMedio e7=new ensinoMedio();
        ensinoMedio e8=new ensinoMedio();
        graduado e9=new graduado();
        graduado e10=new graduado();
        e1.mostraRenda();
        e2.mostraRenda();
        e3.mostraRenda();
        e4.mostraRenda();
        e5.mostraRenda();
        e6.mostraRenda();
        e6.mostraRenda();
        e7.mostraRenda();
        e8.mostraRenda();
        e9.mostraRenda();
        e10.mostraRenda();
        f1.addFuncionario(e1);
        f1.addFuncionario(e2);
        f1.addFuncionario(e3);
        f1.addFuncionario(e4);
        f1.addFuncionario(e5);
        f1.addFuncionario(e6);
        f1.addFuncionario(e7);
        f1.addFuncionario(e8);
        f1.addFuncionario(e9);
        f1.addFuncionario(e10);
        ArrayList<funcionarios> funcionario =  new  ArrayList <funcionarios>();
        funcionario.add(e1);
        funcionario.add(e2);
        f1.gastoTotal();
        f1.gastoMedio();
        f1.gastoGraduado();


    }
}

package atividade_11;

public class empresaEx {
    public static void main(String[] args) {
        empresa em1=new empresa();
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
        e1.getRendaTotal();
        e2.getRendaTotal();
        e3.getRendaTotal();
        e4.getRendaTotal();
        e5.getRendaTotal();
        e6.getRendaTotal();
        e7.getRendaTotal();
        e8.getRendaTotal();
        e9.getRendaTotal();
        e10.getRendaTotal();
        em1.contratarFuncionario(e1);
        em1.contratarFuncionario(e2);
        em1.contratarFuncionario(e3);
        em1.contratarFuncionario(e4);
        em1.contratarFuncionario(e5);
        em1.contratarFuncionario(e6);
        em1.contratarFuncionario(e7);
        em1.contratarFuncionario(e8);
        em1.contratarFuncionario(e9);
        em1.contratarFuncionario(e10);
        em1.gastoTotal();
        em1.gastoNivelN();
        em1.gastoNivelB();
        em1.gastoNivelM();
        em1.gastoNivelG();



    }
}

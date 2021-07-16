package atividade_9;

public class execucao_4 {
    public static void main(String[] args) {
        entrada_cinema e1= new entrada_cinema();
        entrada_cinema e2= new entrada_cinema();
        entrada_cinema e3= new entrada_cinema();
        e1.iniciaAtrib("02\09\2021",14.45,4,20);
        e1.calcularDescontoKids(2010);
        e1.calcularDescontoHora(15.30);
        e1.toString();
        e2.iniciaAtrib("02\09\2021",14.45,4,20);
        e2.calcularDescontoEst(2003,0443267);
        e2.toString();
        e3.iniciaAtrib("02\09\2021",14.45,4,20);
        e3.calcularDescontoKids(1988);
        e3.toString();
    }
}

package atividade_9;

public class _3pessoasExe {
    public static void main(String[] args) {
       _3pessoas p1=new _3pessoas();
        _3pessoas p2=new _3pessoas();
        _3pessoas p3=new _3pessoas();
        _3pessoas p4=new _3pessoas();
        _3pessoas p5=new _3pessoas();
        _3pessoas p6=new _3pessoas();
       p1.setNomep("Joao");
       p2.setNomep("Isabel");
       p3.setNomep("Luiz");
       p4.setNomep("Ana");
       p5.setNomep("Elsa");
       p6.setNomep("Valdomiro");
       p1.setMae(p2);
       p1.setPai(p3);
       p2.setPai(p6);
       p2.setMae(p5);
       p4.setPai(p3);
       p4.setMae(p2);
       p1.ehmesmaP(p2);
       p1.ehIrma(p4);
       p1.antecess(p5);
    }
}

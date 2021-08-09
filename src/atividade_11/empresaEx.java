package atividade_11;

public class empresaEx {
    public static void main(String[] args) {
        empresa em1=new empresa();
        funcionarios f1=new funcionarios();
        funcionarios f2=new funcionarios();
        funcionarios f3=new funcionarios();
        funcionarios f4=new funcionarios();
        funcionarios f5=new funcionarios();
        funcionarios f6=new funcionarios();
        funcionarios f7=new funcionarios();
        funcionarios f8=new funcionarios();
        funcionarios f9=new funcionarios();
        funcionarios f10=new funcionarios();
        f1.setEstudouBasico(true);
        f2.setEstudouBasico(true);
        f3.setEstudouBasico(true);
        f4.setEstudouBasico(true);
        f5.setEstudouBasico(true);
        f6.setEstudouBasico(true);
        f7.setEstudouBasico(true);
        f8.setEstudouBasico(true);
        f5.setEstudouMedio(true);
        f6.setEstudouMedio(true);
        f7.setEstudouMedio(true);
        f8.setEstudouMedio(true);
        f9.setEstudouBasico(true);
        f9.setEstudouMedio(true);
        f9.setGraduou(true);
        f10.setEstudouBasico(true);
        f10.setEstudouMedio(true);
        f10.setGraduou(true);
        f1.rendaTotal();
        f2.rendaTotal();
        f3.rendaTotal();
        f4.rendaTotal();
        f5.rendaTotal();
        f6.rendaTotal();
        f7.rendaTotal();
        f8.rendaTotal();
        f9.rendaTotal();
        f10.rendaTotal();
        em1.empresaContrata(f1);
        em1.empresaContrata(f2);
        em1.empresaContrata(f3);
        em1.empresaContrata(f4);
        em1.empresaContrata(f5);
        em1.empresaContrata(f6);
        em1.empresaContrata(f7);
        em1.empresaContrata(f8);
        em1.empresaContrata(f9);
        em1.empresaContrata(f10);
        em1.gastoSemEstudo();
        em1.gastoTotal();
        em1.gastoBasico();
        em1.gastoMedio();
        em1.gastoSuperior();




    }
}

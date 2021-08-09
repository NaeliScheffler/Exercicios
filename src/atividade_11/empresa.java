package atividade_11;

import java.util.ArrayList;

public class empresa {
    public ArrayList<funcionarios> qtdFunc = new ArrayList<>();

    public void empresaContrata(funcionarios f) {
        qtdFunc.add(f);
    }

    public void gastoTotal() {
        float gastoTotal = 0;
        for (funcionarios f : qtdFunc) {
            gastoTotal += f.getRendaTotal();
        }
        System.out.println("\n Gasto total: \n" + gastoTotal);
    }

    public void gastoSemEstudo() {
        double gasto = 0;
        for (funcionarios f : qtdFunc) {
            if (f.getEstudouBasico() != true && f.getEstudouMedio() != true && f.getGraduou() != true) {
                gasto = gasto + f.getRendaTotal();
            }
        }
        System.out.println("\nGasto com nivel sem estudo\n" + gasto);
    }

    public void gastoBasico() {
        double gasto = 0;
        for (funcionarios f : qtdFunc) {
            if (f.getEstudouBasico() && f.getEstudouMedio() != true && f.getGraduou() != true) {
                gasto = gasto + f.getRendaTotal();
            }
        }
        System.out.println("\nGasto com o nivel basico\n" + gasto);
    }

    public void gastoMedio() {
        double gasto = 0;
        for (funcionarios f : qtdFunc) {
            if (f.getEstudouBasico() && f.getEstudouMedio() && f.getGraduou() != true) {
                gasto = gasto + f.getRendaTotal();
            }
        }
        System.out.println("\nGasto com o nivel medio\n" + gasto);
    }

    public void gastoSuperior() {
        double gasto = 0;
        for (funcionarios f : qtdFunc) {
            if (f.getEstudouBasico() && f.getEstudouMedio() && f.getGraduou()) {
                gasto = gasto + f.getRendaTotal();
            }
        }
        System.out.println("\nGasto com o nivel superior\n" + gasto);
    }

    @Override
    public String toString() {
        for (funcionarios f : qtdFunc) {
            System.out.println (" Nome " + f.getNome() + " \n " + " Comissao " + f.getComissao() + " \n " + " Salario total:\n " + f.getRendaTotal());
        }
        return null;
    }
}


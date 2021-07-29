package atividade_10;

public class exe_escola {
    public static void main(String[] args) {
        pessoas p1= new pessoas();
        pessoas p2= new pessoas();
        pessoas p3= new pessoas();
        escola e1=new escola();
        p1.setNome("Joao");
        p2.setNome("Carlos");
        p3.setNome("Ana");
        p1.setTipo("Professor");
        p2.setTipo("TAE");
        p3.setTipo("Aluno");
        e1.addPessoa(p1);
        e1.imprimir();
    }
}

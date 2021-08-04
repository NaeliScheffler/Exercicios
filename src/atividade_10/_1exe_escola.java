package atividade_10;

public class _1exe_escola {
    public static void main(String[] args) {
        _1aluno a1= new _1aluno();
        _1professores pr1= new _1professores();
        _1TAE t1= new _1TAE();
        _1escola e1=new _1escola();
        e1.addPessoa(a1);
        e1.addPessoa(pr1);
        e1.addPessoa(t1);
        a1.setNome("Jonas");
        pr1.setNome("Carla");
        t1.setNome("Jose");
        a1.imprimir();
        e1.imprimir();
    }
}

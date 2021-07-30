package atividade_10;

public class testeFuncionario {
    public static void main(String[] args) {
        gerentes g1=new gerentes();
        g1.setNome("Joao Paulo");
        g1.setSalario(5000);
        g1.setNomeUsuario("JoaoPaulo@jp");
        g1.setSenha("J1O2A3O4");

        telefonistas t1= new telefonistas();
        t1.setNome("Paula Silva");
        t1.setSalario(2000);
        t1.setCodEstacao(4321);

        secretario s1=new secretario();
        s1.setNome("Marcos Silva");
        s1.setSalario(1800);
        s1.setRamal(200);

        System.out.println("Gerente\n");
        System.out.println("Nome :\n"+g1.getNome());
        System.out.println("Salario :\n"+g1.getsalario());
        System.out.println("Nome de usuario :\n"+g1.getNomeUsuario());
        System.out.println("Senha :\n"+g1.getSenha());
        System.out.println("Bonificacao :\n"+g1.bonifica());

        System.out.println("Telefonista\n");
        System.out.println("Nome \n:"+t1.getNome());
        System.out.println("Salario :\n"+t1.getsalario());
        System.out.println("Codigo da estacao: \n"+t1.getCodEstacao());
        System.out.println("Bonificacao :\n"+t1.bonifica());

        System.out.println("Secretario\n");
        System.out.println("Nome :\n"+s1.getNome());
        System.out.println("Salario :\n"+s1.getsalario());
        System.out.println("Ramal :\n"+s1.getRamal());
        System.out.println(" Bonificacao :\n"+s1.bonifica());

        s1.mostraDados();
        g1.mostraDados();
        t1.mostraDados();



    }
}

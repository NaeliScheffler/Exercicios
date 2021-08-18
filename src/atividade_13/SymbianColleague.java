package atividade_13;

public class SymbianColleague extends Colleague {
    public SymbianColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("\nMétodo receberMensagem do Symbian");
        System.out.println("Symbian recebeu: " + mensagem);
    }

}

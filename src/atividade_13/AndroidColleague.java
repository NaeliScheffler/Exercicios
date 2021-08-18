package atividade_13;

public class AndroidColleague extends Colleague {


    public AndroidColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("\nMétodo receberMensagem ");
        System.out.println("Android recebeu: " + mensagem);
    }

}
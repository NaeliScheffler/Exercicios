package atividade_13;

public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("\nMétodo enviarMensagem ");
        mediator.enviar(mensagem, this);
    }

    public void receberMensagem(String mensagem){
        System.out.println("\nMétodo receberMensagem ");
}
}

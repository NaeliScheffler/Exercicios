package atividade_13;

import java.util.ArrayList;

public class MensagemMediator implements Mediator{
    protected ArrayList<Colleague> contatos;

    public MensagemMediator() {
        contatos = new ArrayList<Colleague>();
    }

    public void adicionarColleague(Colleague colleague) {
        System.out.println("\nMétodo adicionarColleague ");
        contatos.add(colleague);
    }

    @Override
    public void enviar(String mensagem, Colleague colleague) {
        System.out.println("\nMétodo enviar do MensagemMediador");
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }

    private void definirProtocolo(Colleague contato) {
        System.out.println("\nMétodo definirProtocolo ");
        if (contato instanceof IOSColleague) {
            System.out.println("Protocolo iOS");
        } else if (contato instanceof AndroidColleague) {
            System.out.println("Protocolo Android");
        } else if (contato instanceof SymbianColleague) {
            System.out.println("Protocolo Symbian");
        }
    }

}


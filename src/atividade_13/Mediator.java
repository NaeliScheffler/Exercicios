package atividade_13;

public interface Mediator {

        default void enviar(String mensagem, Colleague colleague){
            System.out.println("\nMétodo enviar do mediador ");
        }


}

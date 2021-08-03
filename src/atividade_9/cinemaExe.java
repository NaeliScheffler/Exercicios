package atividade_9;
import java.util.Date;
public class cinemaExe {
    public static void main(String[] args) {
        entrada_cinema e1= new entrada_cinema();
        cliente_cinema cliente=new cliente_cinema();
        cliente.setAnoNascimento(2004);
        cliente.setNumCarteira(9006543);
        Date x=new Date();
        e1.iniciaAtrib(1330,2,(15/75),2021);
        e1.calculaDesconto(cliente);
        e1.calculaDescontoEst(cliente);
        e1.calculaDescHora();
        e1.toString();
    }
}

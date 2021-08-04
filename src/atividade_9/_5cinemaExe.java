package atividade_9;
import java.util.Date;
public class _5cinemaExe {
    public static void main(String[] args) {
        _4entrada_cinema e1= new _4entrada_cinema();
        _4cliente_cinema c1=new _4cliente_cinema();
        _4cliente_cinema c2=new _4cliente_cinema();
        _4cliente_cinema c3=new _4cliente_cinema();
        c1.setAnoNascimento(2004);
        c1.setNumCarteira(9006543);
        c2.setAnoNascimento(1995);
        c3.setAnoNascimento(2015);
        Date x=new Date();
        e1.iniciaAtrib(1330,2,(15/75),2021);
        e1.calculaDesconto(c1);
        e1.calculaDescontoEst(c1);
        e1.calculaDesconto(c2);
        e1.calculaDesconto(c3);
        e1.calculaDescHora();
        e1.toString();
    }
}

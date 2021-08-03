package atividade_9;
import java.util.ArrayList;
public class instituicao {
    ArrayList < cursos > listaCurso =  new  ArrayList <> ();

    public  int  repr() {
        int quant=0;
         for (cursos c1:listaCurso){
            quant = quant + c1.quantidadeReprov();
        }
        return quant;
    }

    public  int  maiorReceita() {
        float maior =  0 ;
        cursos Maior =  null ;
        for ( cursos c1 : listaCurso) {
            if (c1 .renda () > maior) {
                maior = c1 . renda ();
                Maior = c1;
            }
        }
        return Maior.getCodigo ();
    }

    @Override
    public  String  toString () {
        String string =  " " ;
        for ( cursos c1 : listaCurso) {
            string = string + c1 . toString () ;
        }
        return string;
    }

}


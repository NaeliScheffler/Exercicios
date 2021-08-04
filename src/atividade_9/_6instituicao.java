package atividade_9;
import java.util.ArrayList;
public class _6instituicao {
    ArrayList < _6cursos > listaCurso =  new  ArrayList <> ();

    public  int  repr() {
        int quant=0;
         for (_6cursos c1:listaCurso){
            quant = quant + c1.quantidadeReprov();
        }
        return quant;
    }

    public  int  maiorReceita() {
        float maior =  0 ;
        _6cursos Maior =  null ;
        for ( _6cursos c1 : listaCurso) {
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
        for ( _6cursos c1 : listaCurso) {
            string = string + c1 . toString () ;
        }
        return string;
    }

}


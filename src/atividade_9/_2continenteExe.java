package atividade_9;

import java.util.ArrayList;

public class _2continenteExe {
    public static void main(String[] args) {
            _2Continente c1 =  new _2Continente ();
            c1 . setNome ( " América " );
            _1pais p1 =  new _1pais (" BRA " , " BRASIL " , 8.516000 );
            _1pais p2 =  new  _1pais ( " URU " , " URUGUAI " , 176.215);
            _1pais p3 =  new  _1pais ( " BOL " , " BOLÍVIA " , 1.099000 );
            ArrayList< _1pais > listaPais =  new  ArrayList < _1pais > ();
            listaPais. add (p1);
            listaPais. add (p2);
            listaPais. add (p3);
            c1 .dimensao ();
            c1 . maiorDimensao ();
            c1 . menorDimensao ();
            c1 . populacao ();
            c1 . maiorPop ();
            c1 . menorPop ();
            c1 . setPaises (listaPais);
            c1 . densidadeP ();
            c1 . razaoTerritorial ();
        }
    }







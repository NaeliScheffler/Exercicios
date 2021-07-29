package atividade_9;

import java.util.ArrayList;

public class continenteExe {
    public static void main(String[] args) {
            Continente c1 =  new Continente ();
            c1 . setNome ( " América " );
            pais p1 =  new pais (" BRA " , " BRASIL " , 8.516000 );
            pais p2 =  new  pais ( " URU " , " URUGUAI " , 176.215);
            pais p3 =  new  pais ( " BOL " , " BOLÍVIA " , 1.099000 );
            ArrayList< pais > listaPais =  new  ArrayList < pais > ();
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







package atividade_10;

import java.util.ArrayList;

public  class  _3ColecoesFormas {
    ArrayList < _3forma > lista;

    _3ColecoesFormas () {
        this .lista = new ArrayList < _3forma> ();
    }

    public  void  addFormas ( _3forma  forma ) {
        this.lista . add (forma);
    }

    public  void  imprimir () {
        System.out.println ( " Todas as formas: " );
        for ( _3forma f :  this . lista) {
            System.out.println (f);
        }
    }
}
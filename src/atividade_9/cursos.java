package atividade_9;

import java.util.ArrayList;

public class cursos {
    private int codigo;
    private float valorMens;
    ArrayList < aluno > listaAluno =  new  ArrayList <> ();


        public cursos( int codigo , float valorMens ) {
            this. codigo = codigo;
            this. valorMens = valorMens;
        }

        public  int  getCodigo () {
            return codigo;
        }

        public  void  setCodigo ( int  codigo ) {
            this.codigo=codigo;
        }

        public  double  getValorMensalidade () {
            return valorMens;
        }

        public  void  setValorMensalidade ( double  valorMensalidade ) {
            this. valorMens = valorMens;
        }

        public  int  quantAluno () {
            return  this.listaAluno.size();
        }

        public  void  addAluno( aluno  a1 ) {
            this.listaAluno.add (a1);
        }

        public  int  quantAprov() {
            int quant=0;
            for ( aluno a1 : listaAluno) {
                if (a1.getNota()>=  7 ) {
                    quant ++ ;
                }
            }
            return quant ;
        }

        public  int  quantidadeReprov() {
            int quant=0;
            for( aluno a1 : listaAluno) {
                if (a1.getNota () <  7 ) {
                    quant ++ ;
                }
            }
            return quant;
        }

        public float renda () {
            return ( float ) (listaAluno . size () *  this . valorMens);
        }

        @Override
        public  String  toString (){
            String string=  "Curso:"  +  this. getCodigo () +  "  " ;
            for ( aluno a1 : listaAluno) {
                string= string + a1 . toString () +  " - " ;
            }
            return string;
        }

    }



package atividade_9;

    public  class  aluno {
        private float nota;

        public  aluno( float  nota ) {
            this.nota = nota;
        }

        public  float  getNota () {
            return nota;
        }

        public  void  setNota( float  nota ) {
            this. nota = nota;
        }

       @Override
        public  String  toString () {
            return this.getNota () +  " " ;
        }

    }


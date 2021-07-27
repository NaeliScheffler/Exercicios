package atividade_9;
import java .util. Iterator ;
import java.util.ArrayList;

public class cursos {
    private int codigo;
    private int quantAlunos;
    private float valorMens;

    public int getCod() {
        return codigo;
    }

    public void setCod(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public float getValorMens() {
        return valorMens;
    }

    public void setValorMens(float valorMens) {
        this.valorMens = valorMens;
    }

    public class aluno {
        public int cod_curso;
        public float media;
        public int getCod_curso() {
            return cod_curso;
        }

        public void setCod_curso(int cod_curso) {
            this.cod_curso = cod_curso;
        }

        public float getMedia() {
            return media;
        }
        int aprv = 0;
        int reprov=0;
        public ArrayList <Integer> rep = new ArrayList<Integer>();
        public void setMedia(float media) {
            if (media < 7.0) {
                System.out.println(" A nota está abaixo da media, REPROVADO ");
                this.media = media;

               rep.add(1);
            }
            if (media >= 7.0) {
                System.out.println(" A nota está ACIMA da media, APROVADO ");
                this.media = media;
                aprv++;
            }
            if (media < 0 || media > 10) {
                System.out.println(" ERRO, TENTE NOVAMENTE ");
            }
        }
            public int alunosAprov(){
                return aprv;
            }



        }
        public int totalRep(){
        for(aluno a: rep){

        }

    }
}

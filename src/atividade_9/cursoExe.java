package atividade_9;

public class cursoExe {
    public static void main(String[] args) {
                cursos c1 =new cursos ( 11, 100 );
                cursos c2 = new cursos ( 22 , 200 );
                cursos c3 =  new  cursos ( 33 , 300 );
                aluno a1=new aluno(7);
                aluno a2=new aluno(8);
                aluno a3=new aluno(5);
               instituicao e1 = new instituicao ();
                e1 . listaCurso . add (c1);
                e1 . listaCurso . add (c2);
                e1 . listaCurso . add (c3);
                c1.addAluno(a1);
                c2.addAluno(a2);
                c3.addAluno(a3);



                System.out.println ( " Quantidade de alunos aprovados: " );
                for ( cursos cc : e1.listaCurso) {
                    System .out. println (cc .getCodigo () +  "  "  + cc . quantAprov ());
                }

                System.out.println ( " Quantidade de reprovados nos cursos "  + e1 . repr ());
                System.out.println ( " Código do curso que gera maior renda "  + e1 . maiorReceita ());


            }
        }



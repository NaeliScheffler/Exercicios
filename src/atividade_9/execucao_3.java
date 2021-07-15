package atividade_9;

public class execucao_3 {
    public static void main(String[] args) {
        pessoas p1= new pessoas("Joao");
p1.pessoasAdd("Joao","Pedro","Maria","Marta","Mario","Joana","Jose");

   pessoas p2=new pessoas("Marcos");
   p2.pessoasAdd("Marcos","Tiago","Valeria","Elsa","Ari","Mariana","Walter");

   p2.ehmesmaP(p2);
    }
}

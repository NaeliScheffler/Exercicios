package atividade_13;

public class PRINCIPAL {
    public static void main (String[] args){
        pessoa p1=new pessoa("Pedro");
        triatleta t1=new triatleta(p1);
        t1.correr();
        t1.nadar();
        t1.pedalar();
        //p1.correr(); não funciona
        //p1.pedalar(); não funciona
    }
}

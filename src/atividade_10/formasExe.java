package atividade_10;

public class formasExe   {
    public static void main(String[] args) {
forma bidimensional =new forma();
forma tridimensional=new forma();
tridimensional cubo=new tridimensional();
        cubo.setArea(7);
        cubo.setVolume(8);
        cubo.imprimir();
        Quadrado q1=new Quadrado('X');
        q1.imprimir();
        q1.desenhar();
        q1.setArea(3);
        Triangulo t1=new Triangulo('A');
        t1.desenhar();
        Circulo c1=new Circulo('O');
        c1.desenhar();


    }
}

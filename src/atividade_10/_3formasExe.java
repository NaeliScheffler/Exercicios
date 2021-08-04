package atividade_10;

public class _3formasExe   {
    public static void main(String[] args) {
            _3forma bidimensional =new _3forma();
            _3forma tridimensional=new _3forma();
            _3tridimensional cubo=new _3tridimensional();
        cubo.setArea(7);
        cubo.setVolume(8);
        cubo.imprimir();
            _3Quadrado q1=new _3Quadrado('X');
        q1.imprimir();
        q1.desenhar();
        q1.setArea(3);
            _3Triangulo t1=new _3Triangulo('A');
        t1.desenhar();
            _3Circulo c1=new _3Circulo('O');
        c1.desenhar();


    }
}

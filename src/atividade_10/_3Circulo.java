package atividade_10;

public class _3Circulo extends _3bidimensional{

    public _3Circulo(char caracter) {
        super(caracter);
    }
    public void desenhar(){
        System.out.printf("""
                  %s%s
                %s%s%s%s%s
                  %s%s
                """,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
    }
}

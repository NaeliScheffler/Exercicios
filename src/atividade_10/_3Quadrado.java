package atividade_10;

public class _3Quadrado extends _3bidimensional{
    public _3Quadrado(char caracter) {
        super(caracter);
    }

    public void desenhar(){
        System.out.printf("""
                %c%c%c
                %c%c%c
                %c%c%c
                """,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
    }
}

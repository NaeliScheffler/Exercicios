package atividade_10;

public class Quadrado extends bidimensional{
    public Quadrado(char caracter) {
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

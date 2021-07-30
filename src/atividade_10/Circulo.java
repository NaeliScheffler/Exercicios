package atividade_10;

public class Circulo extends bidimensional{

    public Circulo(char caracter) {
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

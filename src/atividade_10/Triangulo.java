package atividade_10;

public class Triangulo extends bidimensional{
    public Triangulo(char caracter) {
        super(caracter);
    }
    public void desenhar(){
        System.out.printf("""
                  %s
                 %s%s
                %s%s%s%s
                """,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
    }
}

package atividade_10;

public class bidimensional extends forma {
    public char caracter;

    public float getArea(){
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public void imprimir() {
            System.out.println(" A classe eh:  " + getClass());
            System.out.println(" A area eh:  " + getArea());
        }
public bidimensional(char caracter){
        this.caracter=caracter;
}
    }


package atividade_10;

public class _3bidimensional extends _3forma {
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
public _3bidimensional(char caracter){
        this.caracter=caracter;
}
    }


package atividade_10;

public class _3tridimensional extends _3forma{
    public float volume;

    public float getArea(){
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public float getVolume(){
        return volume;
    }
    public void setVolume(float volume){
        this.volume=volume;
    }
    public void imprimir() {
            System.out.println(" A classe eh:  " + getClass());
            System.out.println(" A area eh:  " + getArea());
            System.out.println(" O volume eh:  " +getVolume());
        }
}

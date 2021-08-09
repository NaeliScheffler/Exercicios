package atividade_11;

public class funcionarios extends  empresa {
    public String nome;
    public int cod;
    public double rendaBasica = 1000;
    public double rendaT=1000;
    public boolean estudouBasico;
    public boolean estudouMedio;
    public boolean graduou;

    public void funcionarios(int cod,String nome){
        this.cod=cod;
        this.nome=nome;
    }

    public void setEstudouBasico(boolean estudouBasico){
        this.estudouBasico=estudouBasico;
    }
    public void setEstudouMedio(boolean estudouMedio){
        this.estudouMedio=estudouMedio;
    }
    public void setGraduou(boolean graduou){
        this.graduou=graduou;
    }
    public boolean getEstudouBasico(){
        return estudouBasico;
    }
    public boolean getEstudouMedio(){
        return estudouMedio;
    }
    public boolean getGraduou(){
        return graduou;
    }
    public void rendaTotal() {
        double rendaTotal;
        if (estudouBasico) {
            rendaTotal = rendaBasica + rendaBasica * 0.1;
            rendaT=0;
            rendaT=rendaTotal;
        }
        if (estudouMedio) {
            rendaTotal =0;
            rendaTotal=rendaBasica + rendaBasica * 0.1;
            rendaTotal = rendaTotal + rendaTotal * 0.5;
            rendaT=0;
            rendaT=rendaTotal;
        }
        if (graduou) {
            rendaTotal =0;
            rendaTotal=rendaBasica + rendaBasica * 0.1;
            rendaTotal = rendaTotal + rendaTotal * 0.5;
            rendaTotal = rendaTotal + rendaTotal * 1;
            rendaT=0;
            rendaT=rendaTotal;
        }
    }
        public double getRendaTotal(){
            return rendaT;
        }


    }




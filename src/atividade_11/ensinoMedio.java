package atividade_11;

public class ensinoMedio extends funcionarios {
    public String escBasica;
    public String escMedia;

    public void mostraRenda(){
        double renda;
        renda= comissoes+rendaBasica+(rendaBasica*0.10);
        renda=renda+(renda*0.50);
        System.out.println(renda);
        rendaT.add(renda);
        rendaM.add(renda);
    }
}

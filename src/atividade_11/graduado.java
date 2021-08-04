package atividade_11;

public class graduado extends funcionarios{
    public String escBasica;
    public String escMedia;
    public String universidade;

    public void mostraRenda(){
        double renda;
        renda=comissoes+ rendaBasica+(rendaBasica*0.10);
        renda=renda+(renda*0.50);
        renda=renda+(renda*1);
        System.out.println(renda);
        rendaT.add(renda);
        rendaG.add(renda);
    }
}

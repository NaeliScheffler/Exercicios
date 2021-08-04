package atividade_11;

public class ensinoBasico extends funcionarios {
    public String escBasica;
    double renda;

    public void mostraRenda() {
        renda = comissoes + rendaBasica + (rendaBasica * 0.10);
        System.out.println(renda);
        rendaT.add(renda);
        rendaB.add(renda);
    }


    }


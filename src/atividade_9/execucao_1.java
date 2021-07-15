package atividade_9;
import java.util.ArrayList;
public class execucao_1 {
    public static void main(String[] args) {
            pais p1 = new pais("BRA", "BRASIL", 232323.23);
            pais p2 = new pais("ARG", "ARGENTINA", 2323.23);
            pais p3 = new pais("URU", "URUGUAI", 2323.23);
            pais p4 = new pais("EQU", "EQUADOR", 2323.23);
            pais p5 = new pais("BOL", "BOLÍVIA", 2323.23);

            p1.paisFronteira.add(p2);
            p1.paisFronteira.add(p3);
            p1.paisFronteira.add(p5);
            p2.paisFronteira.add(p1);
            p2.paisFronteira.add(p3);
            p2.paisFronteira.add(p5);
            p3.paisFronteira.add(p1);
            p3.paisFronteira.add(p2);
            p5.paisFronteira.add(p1);
            p5.paisFronteira.add(p2);

            System.out.print("p1 é igual ao p2? ");
            boolean resp = p1.ehOMesmoPais(p2);
            System.out.println(resp);

            System.out.print("Argentina faz fronteira com o Brasil?");
            resp = p2.ehLimitrofe(p1);
            System.out.println(resp);

            System.out.println("Paises que fazem fronteira com o Brasil e com a Argentina:");
            ArrayList<pais> comuns = p1.vizinhosComuns(p2);
            for(pais p : comuns){
                System.out.println(p.getNome());
            }

        }
    }


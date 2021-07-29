package atividade_10;
import java.util.ArrayList;

public class escola {
        ArrayList<pessoas> pessoa;

        escola(){this.pessoa=new ArrayList<pessoas>();}
        public void addPessoa(pessoas p){
                this.pessoa.add(p);
        }
        public void imprimir(){
                System.out.println(" O nome da pessoa eh: ");
                for( pessoas p:this.pessoa){
                        System.out.println(p.getNome());
                        System.out.println(" A classe da pessoa eh:  "+pessoa.getClass());

                }
        }

}





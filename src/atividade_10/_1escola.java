package atividade_10;
import java.util.ArrayList;

public class _1escola {
        ArrayList<_1pessoas> pessoa;

        _1escola(){this.pessoa=new ArrayList<_1pessoas>();}
        public void addPessoa(_1pessoas p){
                this.pessoa.add(p);
        }
        public void imprimir(){
                System.out.println(" O nome da pessoa eh: ");
                for( _1pessoas p:this.pessoa){
                        System.out.println(p.getNome());
                        System.out.println(" A classe da pessoa eh:  "+pessoa.getClass());

                }
        }

}





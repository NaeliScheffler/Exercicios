package atividade_11;

public class animalExe {
    public static void main(String[] args) {
        _1cachorro c1=new _1cachorro();
        _1animal a1=new _1animal();
        _1animal a2=new _1animal();
        _1animal a3=new _1animal();
        _1animal a4=new _1animal();
        _1animal a5=new _1animal();
        _1animal a6=new _1animal();
        _1animal a7=new _1animal();
        _1cavalo ca1= new _1cavalo();
        _1preguica p1=new _1preguica();
        veterinario v1=new veterinario();
        zoologico z1=new zoologico();
        v1.examinar(c1);
        v1.examinar(ca1);
        v1.examinar(p1);
        z1.addAnimal(c1);
        z1.addAnimal(ca1);
        z1.addAnimal(p1);
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.addAnimal(a3);
        z1.addAnimal(a4);
        z1.addAnimal(a5);
        z1.addAnimal(a6);
        z1.addAnimal(a7);
        z1.percorreJaulas();



    }
}

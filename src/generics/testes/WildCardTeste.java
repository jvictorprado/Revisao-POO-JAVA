package generics.testes;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void consultar();
}

class Cachorro extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultando gato");
    }
}

public class WildCardTeste {
    public static void main(String[] args) {
        //1
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        //aqui vc pode usar polimorfismo.. pq tratam-se de arrays
        consultarAnimais(cachorros);
        consultarAnimais(gatos);

        System.out.println("----------");

        //2 e 3
        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        //consultarAnimaisList(cachorroList);
        //2 acima houve erro de compilação, pq quando se trabalha com coleções vc precisa passar exatamente o msm tipo pedido nos parametros, como abaixo :
        List<Animal> animalList = new ArrayList<>();
        consultarAnimaisList(animalList);


        //3
        consultarAnimaisCoringa(cachorroList);
    }


    //1
    public static void consultarAnimais(Animal[] animais) {
        for (Animal animal : animais) {
            animal.consultar();
        }
    }


    //2
    public static void consultarAnimaisList(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.consultar();
        }
        //apesar de não poder passar nos parametros, vc pode adc a essa lista um gato ou cachorro
        animais.add(new Cachorro());
        animais.add(new Gato());
    }


    //3 com o wildcard/coringa "?" vc pode receber qualquer subclasse de animal, mas não inserir nada
    public static void consultarAnimaisCoringa(List<? extends Animal> animais) {
        for (Animal animal : animais) {
            animal.consultar();
        }
    }
}

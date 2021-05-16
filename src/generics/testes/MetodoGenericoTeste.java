package generics.testes;

import generics.classes.Carro;
import generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        criarArray(new Carro("Gol"));
        List<Computador> computadores = criarArrayRetorno(new Computador("Dell"));
        System.out.println(computadores);
    }

    // o metodo vai criar um arraylist e o tipo desse arraylist vai ser definido na chamada
    //vai ser estranho, pq quando se cria um metodo generico, vc bota o <T> antes do retorno
    //Obs: se vc tirar o <T> do metodo, ele não compilará. A não ser que vc coloque na classe o <T>
    //Curiosidade: em vez de <? extends Classe> você faria <T extends Classe>
    public static <T> void criarArray(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }

    public static <T> List criarArrayRetorno(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }
}

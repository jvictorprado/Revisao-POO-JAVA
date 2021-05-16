package generics.testes;

import generics.classes.Carro;
import generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        Alugaveis<Carro> carroAlugavel = new Alugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolver(carro);

        System.out.println("-------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("HP"));
        computadoresDisponiveis.add(new Computador("Dell"));
        Alugaveis<Computador> computadorAlugavel = new Alugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getDisponivel();
        System.out.println("Alugando o PC");
        computadorAlugavel.devolver(computador);
    }
}

//A notação "T" significa que vc vai passar um tipo para a classe
class Alugaveis<T>{
    private List<T> objetosDisponiveis;

    public Alugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    //alugar
    public T getDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando" + t);
        System.out.println("Disponiveis: "+ objetosDisponiveis);
        return t;
    }

    public void devolver(T t){
        System.out.println("Devolvendo"+ t);
        objetosDisponiveis.add(t);
        System.out.println("Disponiveis: "+ objetosDisponiveis);
    }
}

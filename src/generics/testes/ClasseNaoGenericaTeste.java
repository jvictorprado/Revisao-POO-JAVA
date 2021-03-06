package generics.testes;

import java.util.ArrayList;
import java.util.List;
import generics.classes.Carro;
import generics.classes.Computador;

public class ClasseNaoGenericaTeste {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mês !");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("------------------------");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computadorAlugado = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o computador");
        computadorAlugavel.devolverComputador(computadorAlugado);
    }
}

class CarroAlugavel{
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }
    
    //alugar
    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro" + c);
        System.out.println("Carros disponiveis: "+ carrosDisponiveis);
        return c;
    }

    public void devolverCarro(Carro c){
        System.out.println("Devolvendo carro"+ c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: "+ carrosDisponiveis);
    }
}


class ComputadorAlugavel{
    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("HP"));
        computadoresDisponiveis.add(new Computador("Dell"));
    }

    //alugar
    public Computador getComputadorDisponivel(){
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando Computador" + c);
        System.out.println("Computadores disponiveis: "+ computadoresDisponiveis);
        return c;
    }

    public void devolverComputador(Computador c){
        System.out.println("Devolvendo Computador"+ c);
        computadoresDisponiveis.add(c);
        System.out.println("Computadores disponiveis: "+ computadoresDisponiveis);
    }
}
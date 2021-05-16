package generics.testes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste {
    public static void main(String[] args) {
        //Antes se fazia assim. Vc criava uma lista e recebia qualquer tipo de objeto nela.
        List lista = new ArrayList();
        lista.add(2);
        lista.add("string");
        System.out.println(lista);
        // se fosse usar um for e quisesse pegar o valores de dentro:
        //obs... nesse caso especifico, não precisava dos ifs
        for (Object obj : lista) {
            if (obj instanceof Integer) {
                System.out.println(obj);
            }
            if (obj instanceof String) {
                System.out.println(obj);
            }
            if (obj instanceof Object) {
                System.out.println(obj);
            }
        }


        //Com o Generics vc diz o tipo que haverá na lista
        List<String> lista2 = new ArrayList<>();
        lista2.add("JV");
        lista2.add("VP");
        for(String obj : lista2){
            System.out.println(obj);
        }

        add(lista2, 1l);
    /* Se tirar o comentário, vai dar erro na execução. Lembrar que o generics só existe em compilação. Então em tempo
    de execução o java n sabe que a lista de cima é de string
        for(String obj : lista2){
            System.out.println(obj);
        }*/
    }

    public static void add(List pLista, Long l){
        pLista.add(l);
    }
}


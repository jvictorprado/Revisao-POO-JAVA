package aula;

public class Aulas {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.setPonta(0.5f);
        c1.carga = 2;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}

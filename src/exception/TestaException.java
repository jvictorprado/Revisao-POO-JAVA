package exception;

public class TestaException {
    public static void metodo1(){
        try {
            new ContadoBem().saca(600);
        }catch (SaldoInsuficienteException e){
            //System.out.println("Exception tratada");
            e.getMessage();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        metodo1();
    }
}

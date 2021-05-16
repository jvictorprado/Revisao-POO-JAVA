package aula;

public class CriarContas {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(808060);
        c1.setDono("Victor");
        c1.abrirConta("CC");
        c1.depositar(501);
        c1.pagarMensal();
        c1.estadoAtual();

        Conta c2 = new Conta();
        c1.setNumConta(808060);
        c2.setDono("Vilma");
        c2.abrirConta("CP");
        c2.depositar(120);
        c2.pagarMensal();
        c2.estadoAtual();
        c2.sacar(250);
        c2.fecharConta();


    }
}

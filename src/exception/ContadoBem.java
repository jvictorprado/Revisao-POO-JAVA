package exception;

public class ContadoBem {
    double saldo = 100;

    void saca(double qtd) throws SaldoInsuficienteException{
        if(this.saldo < qtd){
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar");
        }
        saldo-=qtd;
    }
}

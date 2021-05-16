package aula;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.status = false;
        this.saldo = 0;
    }

    public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("----------------------------");
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            System.out.println("Abrindo uma conta corrente!");
        } else if (t == "CP") {
            this.setSaldo(150);
            System.out.println("Abrindo uma conta poupança!");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Enquanto você estiver com o saldo negativo, não será possível fechar a conta.");
        } else {
            System.out.println("Saque o saldo restante para poder fechar a conta.");
            //sacar(saldo);
        }
    }

    public void depositar(float deposito) {
        if (isStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Impossivel depositar!");
        }
    }

    public void sacar(float saque) {
        if (this.isStatus()) {
            if (this.getSaldo() >= saque) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int mensal;
        if (this.getTipo() == "CC") {
            mensal = 12;
        } else if (this.getTipo() == "CP") {
            mensal = 20;
        } else {
            mensal = 0;
        }
        if (isStatus()) {
            if (this.getSaldo() >= mensal) {
                this.setSaldo(this.getSaldo() - mensal);
                System.out.println("Mensalidade paga!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossivel pagar!");
        }
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

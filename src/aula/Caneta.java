package aula;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setCarga(carga);
        this.setTampada(tampada);
    }

    public Caneta() {
    }

    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("ERRO");
        } else {
            System.out.println("Escrevendo");
        }
    }

    // se o tampar ou o destampar forem publicos ou protegidos vc pode acessar a variavel tampada a partir deles ( na main )
    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}


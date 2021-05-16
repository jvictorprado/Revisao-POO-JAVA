package exercicio01;

public interface Publication {
    public abstract void open();
    public abstract void close();
    public abstract  void flipThrough(int p);
    public abstract void nextPage();
    public abstract void backPage();
}

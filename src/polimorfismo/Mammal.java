package polimorfismo;

public class Mammal extends  Animal{
    private String furColor;

    @Override
    public void locomotion() {
        System.out.println("Running");
    }

    @Override
    public void feeding() {
        System.out.println("Suckling");
    }

    @Override
    public void sound() {
        System.out.println("Generic sound of a mammal");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}

package polimorfismo;

public class Reptile extends Animal{
    private String scaleColor;

    @Override
    public void locomotion() {
        System.out.println("Crawling");
    }

    @Override
    public void feeding() {
        System.out.println("Eating meat");
    }

    @Override
    public void sound() {
        System.out.println("Generic sound of a reptile");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}

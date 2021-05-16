package polimorfismo;

public class Fish extends Animal{
    private String scaleColor;

    public void dropBubble(){
        System.out.println("Glub gub ºoOo°oO");
    }

    @Override
    public void locomotion() {
        System.out.println("Swimming");
    }

    @Override
    public void feeding() {
        System.out.println("Eating another smaller fish");
    }

    @Override
    public void sound() {
        System.out.println("Fish doesn't produce sounds.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}

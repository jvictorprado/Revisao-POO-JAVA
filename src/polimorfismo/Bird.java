package polimorfismo;

public class Bird extends Animal{
    private String featherColor;

    public void makeNest(){
        System.out.println("Making a nets");
    }

    @Override
    public void locomotion() {
        System.out.println("Flying");
    }

    @Override
    public void feeding() {
        System.out.println("Eating fruits or smaller animals");
    }

    @Override
    public void sound() {
        System.out.println("Generic sound of a bird");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}

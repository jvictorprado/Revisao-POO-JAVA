package polimorfismo;

public class Dog extends Mammal{

    public void buryBone(){
        System.out.println("Burying a bone");
    }

    public void wagTail(){
        System.out.println("Wagging the tail");
    }

    @Override
    public void sound() {
        System.out.println("Barking");
    }
}

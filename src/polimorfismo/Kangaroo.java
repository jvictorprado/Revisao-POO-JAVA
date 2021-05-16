package polimorfismo;

public class Kangaroo extends Mammal{

    public void useBag(){
        System.out.println("Using bag");
    }

    @Override
    public void locomotion() {
        System.out.println("Jumping");
    }
}

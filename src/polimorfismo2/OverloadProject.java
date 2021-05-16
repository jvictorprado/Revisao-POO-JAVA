package polimorfismo2;

public class OverloadProject {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.react("Hello");
        d1.react("Vai apanhar");
        d1.react(true);
        d1.react(10, 13);
        d1.react(13, 15);

    }
}

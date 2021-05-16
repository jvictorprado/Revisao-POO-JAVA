package polimorfismo2;

public class Dog extends Wolf {
    @Override
    public void sound() {
        System.out.println("(Barking) au au!");
    }

    public void react(String phrase) {
        if ((phrase.equals("Take the food")) || (phrase.equals("Hello"))) {
            System.out.println("Bark and Shake the tail");
        } else {
            System.out.println("Growl");
        }
    }

    public void react(int hour, int minute) {
        if (hour < 12) {
            System.out.println("Shake tail");
        } else if (hour >= 18) {
            System.out.println("Ignore");
        } else {
            System.out.println("Bark and shake the tail");
        }
    }

    public void react(boolean owner) {
        if (owner) {
            System.out.println("Shake the tail");
        } else {
            System.out.println("Growl and bark");
        }
    }

    public void react(int age, float weight) {
        if(age < 6) {
            if (weight < 10) {
                System.out.println("Shake");
            } else {
                System.out.println("Bark");
            }
        }else {
            if (weight < 10) {
                System.out.println("Growl");
            } else {
                System.out.println("Ignore");
            }
        }
    }
}

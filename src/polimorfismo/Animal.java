package polimorfismo;


public abstract class Animal {

    protected float weight;
    protected int age;
    protected int limbs;

    public abstract void locomotion();

    public abstract void feeding();

    public abstract void sound();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
}

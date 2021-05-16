package projeto;

public abstract class Human {
    protected String name, sex;
    protected int age;
    protected float xp;

    protected abstract void getXP();

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.xp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", xp=" + xp +
                '}';
    }
}

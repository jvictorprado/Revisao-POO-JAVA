package exercicio01;

public class Person {
    private String name, sexo;
    private int age;

    public Person(String name, String sexo, int age) {
        this.name = name;
        this.sexo = sexo;
        this.age = age;
    }

    public void makeBday(){
        this.age += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
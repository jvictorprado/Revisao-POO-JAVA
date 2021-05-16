package UEC;

public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victories;
    private int defeats;
    private int ties;

    public Fighter(String name, String nationality, int age, float height, float weight, int victories, int defeats, int ties) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.defeats = defeats;
        this.ties = ties;
    }

    public void presentation() {
        System.out.println("Fighter: " + this.getName());
        System.out.println("Ogirin: " + this.getNationality());
        System.out.println("Age: " + this.getAge() + " years old");
        System.out.println("Height: " + this.getHeight() + "m");
        System.out.println("Weight: " + this.getWeight() + "kg");
        System.out.println("Victories: " + this.getVictories() + ".  Defeats: " + this.getDefeats() + ".  Ties: " + this.getTies() +".");
    }

    public void status() {
        System.out.println(this.getName());
        System.out.println("Is of the category: " + this.getCategory());
        System.out.println(this.getVictories() + " victories,");
        System.out.println(this.getDefeats() + " defeats,");
        System.out.println(this.getTies() + " ties.");
    }

    public void win() {
        this.setVictories(this.getVictories() + 1);
    }

    public void lose() {
        this.setDefeats(this.getDefeats() + 1);
    }

    public void draw() {
        this.setTies(this.getTies() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.getWeight() <= 70.3) {
            this.category = "Slight";
        } else if (this.getWeight() <= 83.9) {
            this.category = "Medium";
        } else if (this.getWeight() <= 120.2) {
            this.category = "Heavy";
        } else if ((this.getWeight() < 52.2) || (this.getWeight() > 120.2)) {
            this.category = "Invalid";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }
}

package exercicio01;

public class BookProject {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        Book[] b = new Book[3];

        p[0] = new Person("Victor", "M", 23);
        p[1] = new Person("Gutierres", "M", 28);

        b[0] = new Book("Frankenstein","Mary Shelley", 300, p[0]);
        b[1] = new Book("O auto da compadecida", "Ariano Suassuna", 150, p[0]);
        b[2] = new Book("A maquina de fazer espanhóis", "Valter Hugo Mãe", 255, p[1]);

        b[1].open();
        b[1].flipThrough(22);
        b[1].nextPage();
        System.out.println(b[1].details());
    }
}

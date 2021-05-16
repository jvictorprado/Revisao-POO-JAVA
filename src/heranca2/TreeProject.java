package heranca2;

public class TreeProject {
    public static void main(String[] args) {
        Visitant v1 = new Visitant();
        v1.setName("Rafael");
        v1.setAge(23);
        v1.setSex("M");
        System.out.println(v1.toString());

        Student s1 = new Student();
        s1.setName("Livia");
        s1.setCourse("Computer Engineering");
        s1.setEnrollment(12321);
        s1.setAge(19);
        s1.setSex("F");
        s1.payTuition();

        Colleger c1 = new Colleger();
        c1.setEnrollment(32123);
        c1.setName("Isabel");
        c1.setAge(24);
        c1.setSex("F");
        c1.setCourse("Medicine");
        c1.setScholarship(12.5f);
        c1.payTuition();

    }
}

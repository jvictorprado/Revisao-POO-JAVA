package heranca2;

public class Student extends Person{
    private int enrollment;
    private String course;

    public void payTuition(){
        System.out.println("Paying tuition!");
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

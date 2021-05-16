package heranca2;

public class Colleger extends Student{
    private float scholarship;

    public void renewScholarship(){
        System.out.println("Renewing scholarship!");
    }

    @Override
    public void payTuition() {
        System.out.println(this.name + "is a colleger. Easy payment.");
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
}

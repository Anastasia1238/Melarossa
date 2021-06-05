public class Person {


    private String fullName;
    private int agg;

    public Person(String fullName, int agg) {
        this.fullName = fullName;
        this.agg = agg;
    }

    public Person() {
    }

    public void talk() {
        System.out.println("Говорить: ясно, понятно пойду...");
    }

    public void move() {
        System.out.println("Move: *_* ");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAgg(int agg) {
        this.agg = agg;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAgg() {
        return agg;
    }
}










public class Student {

    private String id;
    private String name;
    private int credits;
    private double gpa;

    public Student (String name) {
        this.name = name;
    }

    public Student (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student (String id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public Student(String id, String name, int credits, double gpa) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
    }

    public void setId (String id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setCredits (int credits) {
        this.credits = credits;
    }

    public void setGpa (double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public double getGpa() {
        return gpa;
    }

}
public class A {

    private int a;
    private double b;

    public A (int a) {
        this.a = a;
    }

    public A (double b) {
        this.b = b;
    }

    public A (int a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA (int a) {
        this.a = a;
    }

    public void setB (double b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String toString() {
        return "a = " + a + ", b = " + b;
    }

}
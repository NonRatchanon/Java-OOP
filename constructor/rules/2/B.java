public class B extends A {

    private int b;

    public B (int a) {
        super(a);
    }

    public B (int a, int b) {
        super(a);
        this.b = b;
    }

    public void setB (int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

}
public class B extends A {

    private int b;

    public B() {}

    public B (int a, int b) {
        super.setA(a);
        this.b = b;
    }

    public void setB (int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

}
public class Demo {

    public static void main (String [] args) {
        B b1 = new B();
        b1.setB(10);
        System.out.println(b1.getA() + ", " + b1.getB());
        B b2 = new B(20);
        System.out.println(b2.getA() + ", " + b2.getB());
        B b3 = new B(30, 40);
        System.out.println(b3.getA() + ", " + b3.getB());
    }

}
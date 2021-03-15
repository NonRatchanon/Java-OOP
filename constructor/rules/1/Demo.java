public class Demo {

    public static void main (String [] args) {
        B b1 = new B();
        b1.setA(10);
        b1.setB(20);
        System.out.println(b1.getA() + ", " + b1.getB());
        B b2 = new B(30, 40);
        System.out.println(b2.getA() + ", " + b2.getB());
    }

}
public class Demo {

    public static void main (String [] args) {
        A a1 = new A();
        a1.setA(10);
        System.out.println(a1.getA());
        A a2 = new A(20);
        System.out.println(a2.getA());
    }

}
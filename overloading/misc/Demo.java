public class Demo {

    public static void main (String [] args) {
        A a1 = new A(10);
        a1.setB(20.3);
        a1.setB(29.5);
        System.out.println(a1.toString());
        A a2 = new A(40.5);
        a2.setA(30);
        System.out.println(a2.toString());
        A a3 = new A(50, 60.7);
        System.out.println(a3.toString());
    }

}
public class Demo {

    public static void main (String [] args) {
        A a = new A();
        a.setA(10);
        System.out.println(a.getA());
        System.out.println(a.getClass().getName());
        System.out.printf("%x\n", a.hashCode());
    }

}
public class Demo {

    public static void main (String [] args) {
        D d = new D();
        d.method1();
        d.method2();
        d.method3();

        C c = new D();
        c.method2();

        A a = new D();
        a.method1();
    }

}
public class TelevisionDemo {

    public static void main (String [] args) {
        Television t = new Television();
        t.setBrand("Samsung");
        t.setModel("S1234D50");
        t.setScreenSize(50);
        System.out.println(t.getBrand());
        System.out.println(t.getModel());
        System.out.println(t.getScreenSize());
        System.out.println();
        SmartTelevision s = new SmartTelevision();
        s.setBrand("LG");
        s.setModel("B456W");
        s.setScreenSize(65);
        s.setOperatingSystem("WebOS");
        System.out.println(s.getBrand());
        System.out.println(s.getModel());
        System.out.println(s.getScreenSize());
        System.out.println(s.getOperatingSystem());
    }

}
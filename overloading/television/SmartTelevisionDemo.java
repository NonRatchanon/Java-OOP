public class SmartTelevisionDemo {

    public static void main (String [] args) {
        SmartTelevision tv = new SmartTelevision("Samsung", "S2020A1", 50, "Android 9");
        RemoteControl re = new RemoteControl("R1010");
        tv.turnOn();
        tv.tune();
        tv.turnOff();
        tv.turnOn(re);
        tv.tune(re);
        tv.tune(re, 1);
        tv.turnOff(re);
    }

}
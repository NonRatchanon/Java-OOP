public class Demo {

    public static void main (String [] args) {
        Airplane a = new Airplane();
        a.startEngine();
        a.stopEngine();
        a.takeOff();
        a.land();
        Glider g = new Glider();
        g.takeOff();
        g.land();
        Car c = new Car();
        c.startEngine();
        c.stopEngine();
        Motorcycle m = new Motorcycle();
        m.startEngine();
        m.stopEngine();
    }

}
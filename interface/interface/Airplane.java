public class Airplane implements Control, Flying {

    public void startEngine() {
        System.out.println("Airplane: start engine!");
    }

    public void stopEngine() {
        System.out.println("Airplane: stop engine!");
    }

    public void takeOff() {
        System.out.println("Airplane: take off!");
    }

    public void land() {
        System.out.println("Airplane: landing!");
    }

}
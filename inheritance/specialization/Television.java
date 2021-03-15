public class Television {

    private String brand;
    private String model;
    private int screenSize;

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setScreenSize (int screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void turnOn() {
        System.out.println("Turn TV On");
    }

    public void turnOff() {
        System.out.println("Turn TV Off");
    }

}
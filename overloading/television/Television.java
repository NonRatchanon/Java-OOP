public class Television {
    
    private String brand;
    private String model;
    private int screenSize;

    public Television() {}
    
    public Television (String brand, String model, int screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }
    
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
        System.out.println("TV: turn on!");
    }

    public void turnOff() {
        System.out.println("TV: turn off!");
    }

    public void tune() {
        System.out.println("TV: tuning!");
    }

}

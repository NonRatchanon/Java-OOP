public class RemoteControl {

    private String model;

    public RemoteControl (String model) {
        this.model = model;
    }
    
    public void setModel (String model) {
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }
    
    public void turnOn() {
        System.out.println("Remote: turn on!");
    }
    
    public void turnOff() {
        System.out.println("Remote: turn off!");
    }
    
    public void tune() {
        System.out.println("Remote: tuning!");
    }
    
    public void tune (int channel) {
        System.out.println("Remote: tuning " + "CH" + channel + "!");
    }
    
}
public class SmartTelevision extends Television {

    private String operatingSystem;

    public SmartTelevision (String brand, String model, int screenSize, String operatingSystem) {
        super(brand, model, screenSize);
        this.operatingSystem = operatingSystem;
    }

    public void setOperatingSystem (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void turnOn (RemoteControl remoteControl) {
         remoteControl.turnOn();
    }

    public void turnOff (RemoteControl remoteControl) {
        remoteControl.turnOff();
    }

    public void tune (RemoteControl remoteControl) {
        remoteControl.tune();
    }

    public void tune (RemoteControl remoteControl, int channel) {
        remoteControl.tune(channel);
    }

}
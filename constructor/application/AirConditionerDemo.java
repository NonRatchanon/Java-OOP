public class AirConditionerDemo {

    public static void main (String [] args) {
        AirConditioner a1 = new AirConditioner();
        a1.setPrice(599.99);
        System.out.println(a1.getBrand() + ", " + a1.getPrice());
        AirConditioner a2 = new AirConditioner("ToonAir");
        a2.setPrice(999.99);
        System.out.println(a2.getBrand() + ", " + a2.getPrice());
        AirConditioner a3 = new AirConditioner("TrumpAir");
        a3.setPrice(799.99);
        System.out.println(a3.getBrand() + ", " + a3.getPrice());
        AirConditioner a4 = new AirConditioner("ClintonAir", 649.99);
        System.out.println(a4.getBrand() + ", " + a4.getPrice());
    }

}


public class Milk extends Product {
    private String brand;

    public Milk (String productName, String brand, double productPrice, int productAmount) {
        super(productName, productPrice, productAmount);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

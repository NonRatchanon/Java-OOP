

public class Coffee extends Product {
    private String type;

    public Coffee (String productName, String type, double productPrice, int productAmount) {
        super(productName, productPrice, productAmount);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}

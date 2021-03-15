
public class Juice extends Product{

    private String type;

    public Juice (String productName, String type, double productPrice, int productAmount) {
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


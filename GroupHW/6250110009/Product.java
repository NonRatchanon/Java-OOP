

public abstract class Product {
    private String productName;
    private double productPrice;
    private int productAmount;

     public Product (String productName, double productPrice, int productAmount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
    }  

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    public void setProductCopies(int productCopies) {
        this.productAmount = productCopies;
    }

    
    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }
}

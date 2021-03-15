

public class CashRegister {
    private double Total;
    private double grandTotal;

    public double getTotal() {
        return Total;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void sellproduct(Product product) {
            int amount = product.getProductAmount();
            Total += product.getProductPrice()*amount;
            System.out.printf("Sold %s @%.2f * %d\n", product.getClass().getName(), product.getProductPrice(), amount);
            System.out.printf("Subtotal %.2f\n", Total);
            grandTotal += Total;
    }

    public void showTotal() {
        System.out.printf("GRAND TOTAL: %.2f\n", grandTotal);
    }
}

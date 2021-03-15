

public class CoffeeDemo{
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Cappuccino Coffee","Cappuccino", 105.00, 2);
        System.out.println(coffee.getProductName());
        System.out.println(coffee.getType());
        System.out.printf("%.2f\n",coffee.getProductPrice());
        System.out.println(coffee.getProductAmount());
        System.out.print("Total price = ");
        System.out.printf("%.2f",coffee.getProductPrice()*coffee.getProductAmount());

    }
}

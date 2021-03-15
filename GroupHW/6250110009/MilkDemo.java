

public class MilkDemo {
    public static void main(String[] args) {
        Milk m = new Milk("Thai-Denmark Milk", "Thai-Denmark", 12.50, 2);
        System.out.println(m.getProductName());
        System.out.println(m.getBrand());
        System.out.printf("%.2f\n",m.getProductPrice());
        System.out.println(m.getProductAmount());
        System.out.print("Total price = ");
        System.out.printf("%.2f",m.getProductPrice()*m.getProductAmount());

    }
}

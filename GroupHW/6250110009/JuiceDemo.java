

public class JuiceDemo {
    public static void main(String[] args) {
        Juice j = new Juice("Orange juice","orange", 18.00, 4);
        System.out.println(j.getProductName());
        System.out.println(j.getType());
        System.out.printf("%.2f\n",j.getProductPrice());
        System.out.println(j.getProductAmount());
        System.out.print("Total price = ");
        System.out.printf("%.2f",j.getProductPrice()*j.getProductAmount());

    }
}

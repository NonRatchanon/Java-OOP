/* 
6250110001  Kampee Kantangkun
6250110002  Natthakarn khunsaman
6250110004  Norapich Pongsuwan
6250110005  Panathanan Patcharaprasertsuk
6250110009  Ratchanon  Songmeuang  
*/

public class CashRegisterDemo {
    public static void main(String[] args) {
        CashRegister C = new CashRegister();
        C.sellproduct(new Milk("UHT Milk", "UHT", 12.00, 5));
        C.sellproduct(new Juice("Apple juice", "Apple", 17.50, 4));
        C.sellproduct(new Coffee("Americano Coffee", "Americano", 115.00, 2));
        C.showTotal();
    }
}

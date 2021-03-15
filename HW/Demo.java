/* 
6250110001  Kampee Kantangkun
6250110002  Natthakarn khunsaman
6250110004  Norapich Pongsuwan
6250110005  Panathanan Patcharaprasertsuk
6250110009  Ratchanon  Songmeuang  
*/

public class Demo {
	public static void main (String[] args) {
		Customer C1 = new Customer("6250110001", "Kampee", "male", "19", 159.25);
		Customer C2 = new Customer("6250110002", "Nattakarn", "male", "20", 297.25);
		Customer C3 = new Customer("6250110004", "Norapich", "male", "21", 799.75);
		Customer C4 = new Customer("6250110005", "Panathanan", "male", "19", 156.50);
		Customer C5 = new Customer("6250110009", "Ratchanon", "male", "19", 199.75);
		Coupon cp = new Coupon();
		DebitCard db = new DebitCard();
		CreditCard cd = new CreditCard();
		Ewallet e = new Ewallet();
		C5.setPay(299.25);
		System.out.print(C1.getID() + " " + C1.getName() + " Buy product "+ C1.getPay() + " baht"+ "\t" );
		C1.pay_Coupon(cp);
		System.out.print(C2.getID() + " " + C2.getName() + " Buy product "+ C2.getPay() + " baht"+ "\t" );
		C2.pay_Debitcard(db);
		System.out.print(C3.getID() + " " + C3.getName() + " Buy product "+ C3.getPay() + " baht"+ "\t" );
		C3.pay_Creditcard(cd);
		System.out.print(C4.getID() + " " + C4.getName() + " Buy product "+ C4.getPay() + " baht"+ "\t" );
		C4.pay_Ewallet(e);
		System.out.print(C5.getID() + " " + C5.getName() + " Buy product "+ C5.getPay() + " baht"+ "\t" );
		C5.pay_Coupon(cp);

}	
}
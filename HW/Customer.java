/* 
6250110001  Kampee Kantangkun
6250110002  Natthakarn khunsaman
6250110004  Norapich Pongsuwan
6250110005  Panathanan Patcharaprasertsuk
6250110009  Ratchanon  Songmeuang  
*/




public class Customer {
	
	private String ID;
	private String name;
	private String gender;
	private String age;
	private double pay;

	// con {}
	public Customer () {
	}
	// con
	public Customer (String ID, String name, String gender, String age, double pay) {
		this.ID = ID ;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.pay = pay;

	}
	// setter 
	public void setID (String ID) {
		this.ID = ID;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setGender (String gender) {
		this.gender = gender;
	}
	public void setPay (double pay) {
		this.pay = pay;
	}

	//getter

	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getAge() {
		return age;
	}
	public double getPay() {
		return pay;
	}

	// function

	public void pay_Coupon(Coupon coupon) {
		coupon.payCoupon();
	}
	public void pay_Creditcard(CreditCard creditCard) {
		creditCard.payCreditcard();
	}
	public void pay_Debitcard(DebitCard debitcard) {
		debitcard.payDebitcard();
	}
	public void pay_Ewallet(Ewallet ewallet) {
		ewallet.payEwallet();
	}
}
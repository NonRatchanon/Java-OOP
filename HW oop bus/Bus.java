public class Bus {
	private String brand ;
	private String color ;
	private String price ;
	private Driver bus_owner ;
	
	public void setBrand(String brand) {
		this.brand = brand ;
	}
	public String getBrand() {
		return brand ;
	}
	
	
	public void setColor(String color) {
		this.color = color ;
	}
	public String getColor() {
		return color ;
	}


	public void setPrice(String price) {
		this.price = price ;
	}
	
	public String getPrice() {
		return price ;
	}
	
	
	public void setOwner(Driver bus_owner) {
		this.bus_owner = bus_owner ;
	}
	public Driver getOwner() {
		return bus_owner ;
	}
}
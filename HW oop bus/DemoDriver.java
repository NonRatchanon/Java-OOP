public class DemoDriver {

public static void main (String[] args) {
	
	Driver Dr = new Driver() ;
	Dr.setDriverID("0009") ;
	Dr.setName("Lord Chanom") ;
	Dr.setAge(19) ;
	
	
	Bus bus = new Bus();
	bus.setBrand("CACO") ;
	bus.setColor("Red") ;
	bus.setPrice("798,000") ;
	bus.setOwner(Dr) ; 
		
	
	System.out.println(Dr.getDriverID() +"\t" +Dr.getName() +"\t\t"+ Dr.getAge()) ;
	System.out.println(bus.getBrand());
	System.out.println(bus.getColor() + "\t" + bus.getPrice()) ;
	System.out.println() ;
	System.out.println(bus.getOwner().getName()) ;
	System.out.println(bus.getOwner().getDriverID()) ;
	
	}
}

	
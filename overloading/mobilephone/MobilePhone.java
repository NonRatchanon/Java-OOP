import java.util.ArrayList;
import java.util.Iterator;

public class MobilePhone {

    private String brand;
    private String model;
    private ArrayList<Contact> contact;

    public MobilePhone (String brand, String model) {
        this.brand = brand;
        this.model = model;
        contact = new ArrayList<Contact>();
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void add (Contact obj) {
        contact.add(obj);
    }

    public void delete (String anyone) {
        Iterator<Contact> it = contact.iterator();
        while (it.hasNext()) {
            Contact ct = it.next();
            if (ct.getName().equals(anyone)) {
                it.remove();
                System.out.println("Deleting..." + ct.getName() + " (" + ct.getPhoneNumber() + ")");
            }
            if (ct.getPhoneNumber().equals(anyone)) {
                it.remove();
                System.out.println("Deleting..." + ct.getPhoneNumber() + " (" + ct.getName() + ")");
            }
        }
    }
    
    public void call (int i) {
        if (i > contact.size()) {
            i %= contact.size();
        }
        i--;
        Contact ct = contact.get(i);
        System.out.println("Calling..." + ct.getName() + " (" + ct.getPhoneNumber() + ")");
    }

    public void call (String str) {
        for (Contact ct : contact) {
            if (ct.getName().equals(str)) {
                System.out.println("Calling..." + ct.getName() + " (" + ct.getPhoneNumber() + ")");
                break;
            }
            if (ct.getPhoneNumber().equals(str)) {
                System.out.println("Calling..." + ct.getPhoneNumber() + " (" + ct.getName() + ")");
                break;
            }
        }
    }
    
    public void list() {
        System.out.println("Contact:");
        for (Contact ct : contact) {
            System.out.printf("%s  ", ct.getPhoneNumber());
            System.out.printf("%s\n", ct.getName());
        }
    }

}
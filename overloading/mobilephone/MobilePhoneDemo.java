public class MobilePhoneDemo {

    public static void main (String [] args) {
        MobilePhone m = new MobilePhone("Mango", "myPhone");
        m.add(new Contact("0899995555", "Tony Stark"));
        m.add(new Contact("0871234567", "Steve Rogers"));
        m.add(new Contact("0859876543", "Natasha Romanoff"));
        m.add(new Contact("0811112222", "Clint Barton"));
        m.call(2);
        m.call("Steve Rogers");
        m.call("0871234567");
        m.delete("Tony Stark");
        m.delete("0811112222");
        m.list();
    }

}
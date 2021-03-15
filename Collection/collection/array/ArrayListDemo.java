import java.util.ArrayList;

public class ArrayListDemo {

    public static void main (String [] args) {
        ArrayList<String> person = new ArrayList<String>();
        person.add("Dang");
        person.add("Dum");
        person.add("Khao");
        person.add("Kiew");
        person.add("Som");
        person.add("Fah");
        for (int i = 0; i < person.size(); i++) {
            System.out.printf("index %d: %s\n", i, person.get(i));
        }
    }

}
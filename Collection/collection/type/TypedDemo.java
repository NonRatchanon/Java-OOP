import java.util.*;

public class TypedDemo {
    
    public static void main (String [] args) {
        List<String> student = new ArrayList<String>();
        student.add("Dang");
        student.add("Dum");
        student.add("Khao");
        student.add("Kiew");
        for (String name : student) {
            System.out.println(name);
        }
    }
    
}
import java.util.*;

public class UntypedDemo {
    
    public static void main (String [] args) {
        List student = new ArrayList();
        student.add("Dang");
        student.add("Dum");
        student.add("Khao");
        student.add("Kiew");
        for (Object name : student) {
            System.out.println(name);
        }
    }
    
}
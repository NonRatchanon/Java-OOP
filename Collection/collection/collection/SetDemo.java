import java.util.*;

public class SetDemo {
    
    public static void main (String [] args) {
        Set<String> student = new HashSet<String>();
        student.add("Dang");
        student.add("Dum");
        student.add("Khao");
        student.add("Kiew");
        System.out.println(student);
        System.out.println();
        Iterator it = student.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println(student.contains("Khao"));
        System.out.println(student.contains("Som"));
    }
    
}
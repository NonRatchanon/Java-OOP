import java.util.*;

public class ListDemo {

    public static void main (String [] args) {
        ArrayList<String> student = new ArrayList<String>();
        student.add("Dang");
        student.add("Dum");
        student.add("Khao");
        student.add("Kiew");
        System.out.println(student);
        System.out.println();
        for (String name : student) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(student.indexOf("Khao"));
        System.out.println(student.indexOf("Som"));
    }

}
import java.util.*;

public class MapDemo {
    
    public static void main (String [] args) {
        Map<String, Integer> student = new HashMap<String, Integer>(); 
        student.put("Dang", 18);
        student.put("Dum", 22);
        student.put("Khao", 20);
        student.put("Kiew", 19);
        System.out.println(student);
        System.out.println();
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            System.out.printf("%-6s%4d\n", entry.getKey(), entry.getValue());
        }
        System.out.println();
        System.out.println(student.containsKey("Som"));
        System.out.println(student.containsValue(20));
    }
    
}
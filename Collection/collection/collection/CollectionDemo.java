import java.util.*;

public class CollectionDemo {
    
    public static void main (String [] args) {
        Map<String, Integer> student = new TreeMap<String, Integer>(); 
        student.put("Dang", 18);
        student.put("Dum", 22);
        student.put("Khao", 20);
        student.put("Kiew", 19);
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            System.out.printf("%-6s%4d\n", entry.getKey(), entry.getValue());
        }
    }
    
}
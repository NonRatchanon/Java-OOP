public class ArrayDemo {
    
    private static int index = 0;
    private static String [] person = new String[6];
    
    public static boolean addName (String name) {
        boolean success = false;
        if (index <= person.length - 1) {
            person[index++] = name;
            success = true;
        }
        return success;
    }
    
    public static void personList() {
        for (int i = 0; i < index; i++) {
            System.out.printf("index %d: %s\n", i, person[i]);
        }
    }
    
    public static void main (String [] args) {
        String [] name = {"Dang", "Dum", "Khao", "Kiew", "Som", "Fah"};
        int count = 0;
        while (addName(name[count])) {
            count++;
            if (count >= person.length) {
                break;
            }
        }
        personList();
    }
    
}
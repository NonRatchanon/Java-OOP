public class StudentDemo {

    public static void main (String [] args) {
        Student student [] = new Student[4];
        student[0] = new Student("Steve ");
        student[1] = new Student("201011", "Steve Rogers");
        student[2] = new Student("202403", "Pepper Potts", 48);
        student[3] = new Student("201504", "Jim Wilson", 36, 3.14);

        System.out.println("ID      NAME              CREDITS   GPA");

        System.out.println(student[0].getId());

        for (Student x : student) {
            System.out.printf("%-8s", x.getId());
            System.out.printf("%-18s", x.getName());
            System.out.printf("%7d", x.getCredits());
            System.out.printf("%6.2f \n", x.getGpa() );
        }  
    }

}
public class StudentDemo {

    public static void main(String[] args) {

        Student student1 =
                new Student("Amaan", 22, 89.5);

        Student student2 =
                new Student("Rahul", 21, 85.0);

        student1.display();

        System.out.println();

        student2.display();
    }
}
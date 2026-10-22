import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Amaan");
        students.put(102, "Rahul");
        students.put(103, "Sara");

        System.out.println(students);

        System.out.println("Student 101: " + students.get(101));

        students.put(102, "Ahmed");

        System.out.println("After update: " + students);

        System.out.println("Has ID 103? "
                + students.containsKey(103));

        students.remove(101);

        System.out.println("Final map: " + students);
    }
}
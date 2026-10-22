import java.util.HashMap;
import java.util.Map;

class HashMapLoop {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Amaan");
        students.put(102, "Rahul");
        students.put(103, "Sara");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}
import java.util.HashSet;

class UniqueNumbers {
    public static void main(String[] args) {
        int[] ids = {101, 102, 103, 102, 101, 104};

        HashSet<Integer> uniqueIds = new HashSet<>();

        for (int id : ids) {
            uniqueIds.add(id);
        }

        System.out.println(uniqueIds);
        System.out.println("Unique count: " + uniqueIds.size());
    }
}
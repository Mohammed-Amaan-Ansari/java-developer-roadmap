import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);

        System.out.println("Contains 20? " + numbers.contains(20));

        numbers.remove(30);

        System.out.println("After removal: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}
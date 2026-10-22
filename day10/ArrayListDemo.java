import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println(numbers);

        System.out.println("First: " + numbers.get(0));

        numbers.set(1, 25);
        System.out.println("After update: " + numbers);

        numbers.remove(Integer.valueOf(30));
        System.out.println("After removal: " + numbers);

        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 20? " + numbers.contains(20));
    }
}
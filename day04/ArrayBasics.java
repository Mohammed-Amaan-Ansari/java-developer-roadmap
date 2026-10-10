public class ArrayBasics {

    public static void main(String[] args) {

        int[] marks = {80, 90, 75, 85, 95};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Third mark: " + marks[2]);
        System.out.println("Array length: " + marks.length);

        // Update an element
        marks[0] = 88;

        System.out.println("Updated first mark: " + marks[0]);
    }
}
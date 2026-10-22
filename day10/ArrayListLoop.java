import java.util.ArrayList;

class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Amaan");
        names.add("Rahul");
        names.add("Sara");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Enhanced for loop:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
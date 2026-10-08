public class LogicalOperators {

    public static void main(String[] args) {

        int age = 22;
        boolean hasDegree = true;

        System.out.println(age >= 18 && hasDegree);
        System.out.println(age >= 18 || hasDegree);
        System.out.println(!hasDegree);
    }
}
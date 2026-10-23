class FinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program completed.");
    }
}
class MultipleCatchDemo {
    public static void main(String[] args) {
        String text = "abc";

        try {
            int number = Integer.parseInt(text);
            int result = 100 / number;

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("End of program.");
    }
}
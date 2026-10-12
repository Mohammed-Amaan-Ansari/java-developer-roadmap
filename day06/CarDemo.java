public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "White";
        car1.speed = 100;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Black";
        car2.speed = 80;

        car1.displayDetails();

        System.out.println();

        car2.displayDetails();
    }
}
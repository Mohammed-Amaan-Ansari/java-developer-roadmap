public class Car {

    String brand;
    String color;
    int speed;

    void drive() {
        System.out.println(brand + " is moving.");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}
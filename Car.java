public class Car {
    //properties
    String model;
    String color;
    int year;
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    // Method to start
    public void startEngine() {
        System.out.println("engine started.");
    }
    // Method to stop
    public void stopEngine() {
        System.out.println("engine stopped.");
    }
    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("-----------------------");
    }
    // Main method
    public static void main(String[] args) {
        //first car object
        Car car1 = new Car("RR","black",2025);
        car1.startEngine();
        car1.stopEngine();
        car1.displayDetails();
        //Second car object
        Car car2 = new Car("BMW", "Blue", 2024);
        car2.startEngine();
        car2.stopEngine();
        car2.displayDetails();
    }
}
public abstract class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("car: " + brand + ", year: " + year);
    }
}

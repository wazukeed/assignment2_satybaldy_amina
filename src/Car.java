public class Car extends Vehicle {
    int doors;
    String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car " + brand + ": Insert key, turn ignition");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car " + brand + ": Turn key to OFF");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // first call dad's method
        System.out.println("Type: Car, Doors: " + doors + ", Fuel: " + fuelType);
    }
}

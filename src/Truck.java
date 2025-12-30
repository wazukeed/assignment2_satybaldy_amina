public class Truck extends Vehicle {
    double capacity;
    int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck " + brand + ": Start diesel engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck " + brand + ": Stop diesel engine");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Capacity: " + capacity + " tons, Axles: " + numAxles);
    }
}

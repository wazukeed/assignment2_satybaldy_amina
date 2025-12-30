public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle " + brand + ": Press start button");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle " + brand + ": Press kill switch");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (hasSidecar) {
            System.out.println("Type: Motorcycle, Sidecar: YES");
        } else {
            System.out.println("Type: Motorcycle, Sidecar: NO");
        }
    }
}

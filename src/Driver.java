public class Driver {
    String name;
    String licenseNumber;

    Vehicle vehicle;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.vehicle = null;
    }

    public void assignVehicle(Vehicle v) {
        this.vehicle = v;
        System.out.println(name + " now drives " + v.brand);
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber);
        if (vehicle != null) {
            System.out.println("His vehicle: " + vehicle.brand);
        } else {
            System.out.println("No vehicle assigned");
        }
    }
}

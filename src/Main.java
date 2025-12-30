public class Main {
    public static void main(String[] args) {
        System.out.println("=== VEHICLE MANAGEMENT SYSTEM ===\n");

        Car car = new Car("Toyota", 2022, 4, "Petrol");
        Motorcycle bike = new Motorcycle("Harley", 2020, false);
        Truck truck = new Truck("Volvo", 2023, 15.5, 3);

        Driver driver1 = new Driver("Aidana", "LICENSE123");
        Driver driver2 = new Driver("Aslan", "LICENSE456");

        driver1.assignVehicle(car);
        driver2.assignVehicle(bike);
        driver1.assignVehicle(truck);

        Vehicle[] allVehicles = {car, bike, truck};

        System.out.println("\n--- DOING SOMETHING WITH ALL VEHICLES ---");
        for (int i = 0; i < allVehicles.length; i++) {
            System.out.println("\nVehicle number " + (i+1) + ":");
            allVehicles[i].startEngine();
            allVehicles[i].displayInfo();
            allVehicles[i].stopEngine();
        }

        System.out.println("\n--- DRIVER INFORMATION ---");
        driver1.displayDriverInfo();
        driver2.displayDriverInfo();

        System.out.println("\n=== END OF PROGRAM ===");
    }
}

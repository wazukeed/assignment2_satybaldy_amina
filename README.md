# assignment2_satybaldy_amina

 A. Project Overview

 Purpose and Description
This Vehicle Management System demonstrates Object-Oriented Programming concepts through a practical example. The program simulates different types of vehicles (cars, motorcycles, trucks) and their drivers, showing how they interact. The system allows creating vehicles, assigning drivers, and performing operations on all vehicles through a unified interface.

Summary of Inheritance, Composition, and Abstraction Usage

Inheritance: The system uses a parent-child relationship where `Vehicle` is the abstract superclass, and `Car`, `Motorcycle`, and `Truck` are subclasses that inherit common properties and behaviors.

Composition: The `Driver` class contains a `Vehicle` object, demonstrating a "has-a" relationship where a driver possesses a vehicle.

Abstraction: The `Vehicle` class is abstract, providing a template for all vehicles while hiding implementation details. It defines what vehicles must do (startEngine, stopEngine) without specifying how.

B. Class Hierarchy

Superclass and Subclasses Explanation

Superclass: `Vehicle` (Abstract)
- Acts as a blueprint for all vehicle types
- Contains common attributes: `brand`, `year`
- Defines required behaviors through abstract methods
- Cannot be instantiated directly

Subclasses:
1. `Car`- Represents passenger cars
   - Additional attributes: `doors`, `fuelType`
   - Specific implementation for cars

2. `Motorcycle` - Represents two-wheeled vehicles
   - Additional attribute: `hasSidecar`
   - Specialized motorcycle behaviors

3. `Truck` - Represents heavy-duty vehicles
   - Additional attributes: `capacity`, `numAxles`
   - Truck-specific operations

 Description of Overridden Methods

Each subclass overrides these key methods:

1. `startEngine()` - Each vehicle type starts differently:
   - Car: "Insert key, turn ignition"
   - Motorcycle: "Press start button"
   - Truck: "Start diesel engine"

2. `stopEngine()` - Each vehicle stops uniquely:
   - Car: "Turn key to OFF"
   - Motorcycle: "Press kill switch"
   - Truck: "Stop diesel engine"

3. `displayInfo()` - Shows vehicle-specific information:
   - Car: Adds doors count and fuel type
   - Motorcycle: Shows sidecar presence
   - Truck: Displays capacity and axles

 Explanation of Access Modifiers Used

1. `protected` - Used for `brand` and `year` in Vehicle class
   - Why: Allows subclasses direct access while preventing access from unrelated classes
   - Example: Subclasses can use `this.brand` directly without getters

2. `private` - Used for subclass-specific fields
   - Why: Encapsulates data within each class
   - Example: `doors` in Car class, `capacity` in Truck class

3. `public` - Used for constructors and methods
   - Why: Allows access from anywhere in the program
   - Example: `startEngine()`, `displayInfo()`

4. `default` (package-private) - Not explicitly used, but available
   - Note: Would be accessible only within the same package

 C. Instructions to Compile and Run
javac *.java
java Main
 D. Screenshots

 
 <img width="678" height="822" alt="Screenshot 2025-12-30 at 13 37 51" src="https://github.com/user-attachments/assets/4f3482ea-b19b-4b4f-8936-0a4be99a21b6" />

 E. Reflection Section
How inheritance simplified the design:
Inheritance let me put all common vehicle features in one parent class (Vehicle). This meant I didn't have to repeat code like brand and year in every vehicle class. When making new vehicle types, I just extended the parent and added only what was special about that vehicle.

How method overriding helped customize behavior:
Even though all vehicles have startEngine() and stopEngine() methods, each type does it differently. Overriding let me give specific instructions for each vehicle while keeping the same method names. This way, I can call the same method on different vehicles and get the right behavior for each one.

Challenges with access modifiers:
Using protected was convenient for subclasses but made me think about data safety. I had to decide between easy access for child classes (protected) versus better protection (private with getters). This taught me that access modifiers affect both how code works and how safe it is.


 




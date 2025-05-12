        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014
 
class Vehicle {
    String brand = "Toyota";
    int wheels = 4;
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
    }
}
class Car extends Vehicle {
    String model = "Corolla";
    int speed = 120;
    
    void showCarDetails() {
        displayInfo(); // Calling base class method
        System.out.println("Model: " + model);
        System.out.println("Top Speed: " + speed + " km/h");
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showCarDetails();
    }
}


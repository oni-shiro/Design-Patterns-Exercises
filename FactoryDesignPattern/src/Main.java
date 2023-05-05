import Factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.getVehicle(4).drive();
    }
}
package Factory;

public class VehicleFactory {
    Vehicle vehicle;

    public VehicleFactory(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleFactory() {
    }
    public Vehicle getVehicle(int id){
        if(id==1){
            return new Car();

        }else{
            return new Cycle();
        }

    }
}

package Factory;

public class Car extends Vehicle{
    public Car() {
    }

    @Override
    public void drive() {
        System.out.println("car ");
    }
}

package car;

public class CarDAO {
    private int nextAvailableSlot = 0;
    public static final int INT = 5;
    //use is to pass data to the carservice class
    Car[] cars = new Car[INT];
    public void saveCar(Car car){
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;
    }
    public Car[] getAllCar() {
        return cars;
    }

}

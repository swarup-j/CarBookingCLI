package car;

public class CarDAO {
    private static Car[] cars;

    static {
        cars = new Car[]{
                new Car(1234, 12.5f, CarBrand.AUDI, false),
                new Car(4932, 52.5f, CarBrand.Tesla, true),
                new Car(8952, 09.5f, CarBrand.BMW, false),
                new Car(6509, 55.5f, CarBrand.HONDA, true)

        };
    }


    public Car[] getAllCar() {
        return cars;
    }

}

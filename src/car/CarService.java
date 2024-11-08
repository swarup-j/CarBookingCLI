package car;

public class CarService {
    private CarDAO cardao;
    public CarService(){
        this.cardao = new CarDAO();
    }

    public int registerCar(Car car){
        //check name
        //check reg no
        //check brand
        cardao.saveCar(car);
        return 1;
    }
    public Car[] seeAllCars(){
        return cardao.getAllCar();
    }
    public void viewAvaialbleElectricCar(){
        for (Car car : cardao.getAllCar()) {
            if(car.isElectric()){
                System.out.println(car.toString());
            }
        }
    }
}

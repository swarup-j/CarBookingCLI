package car;

public class CarService {
    private CarDAO cardao;



    public CarService(CarDAO cardao) {

        this.cardao = cardao;
    }



    public Car[] seeAllCars(){
        return cardao.getAllCar();
    }


    public void viewAvaialbleElectricCar(){
        for (Car car : cardao.getAllCar()) {

            if(car.isElectric() && car!=null){
                System.out.println(car.toString());
            }
        }
    }
}

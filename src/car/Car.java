package car;

import java.util.Objects;

public class Car {
    private int registerNumber;
    private float rentalPricePerDay;
    private CarBrand carBrand;
    private boolean isElectric;
    private boolean isAvailable;

    public Car(int registerNumber, float rentalPricePerDay, CarBrand carBrand, boolean isElectric) {
        this.registerNumber = registerNumber;
        this.rentalPricePerDay = rentalPricePerDay;
        this.carBrand = carBrand;
        this.isElectric = isElectric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return registerNumber == car.registerNumber && rentalPricePerDay == car.rentalPricePerDay && isElectric == car.isElectric && carBrand == car.carBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerNumber, rentalPricePerDay, carBrand, isElectric);
    }

    @Override
    public String toString() {
        return "Car{" +
                "registerNumber=" + registerNumber +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", carBrand=" + carBrand +
                ", isElectric=" + isElectric +
                '}';
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public float getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(int rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}

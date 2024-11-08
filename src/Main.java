import car.Car;
import car.CarBrand;
import car.CarData;
import car.CarService;
import user.UserService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            UserService newUserService = new UserService();
            CarData carData = new CarData();



            System.out.println(
                    """
                            1 - Book Car
                            2- View All User Booked Car
                            3 - View All Bookings
                            4 - View Available Cars
                            5 - View ALl Available Electric Cars
                            6 - View All Users
                            7 - Exit"""
            );
            System.out.println("enter choice : ");
            int ch;
            do {
                 ch = sc.nextInt();
                switch (ch) {
                    case 1: //Book Car
                        System.out.println("1");
                        break;
                    case 2://view all user  booked car
                        break;
                    case 3: //View All Bookings
                        break;
                    case 4://View Available Cars
                        break;
                    case 5://View All Available Electric Cars\
                        carData.viewElectricCars();

                        break;
                    case 6: //View all Users
                        newUserService.viewAllUsers();
                        break;
                    case 7: //exit
                        break;
                    default:
                        throw new IllegalArgumentException("invalid choice");

                }
            } while (ch!= 7);
        }

}
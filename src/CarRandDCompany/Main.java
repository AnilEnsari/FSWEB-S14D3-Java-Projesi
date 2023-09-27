package CarRandDCompany;

import PacificCarCompany.Car;
import PacificCarCompany.Ford;
import PacificCarCompany.Holden;


public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("Base a car", "it has 4 wheels and helps you");

        System.out.println(carSkeleton.startEngine());

        System.out.println(carSkeleton.drive());


        CarSkeleton gasPoweredCar = new GasPoweredCar("Opel", "Astra",4.5,4);

        System.out.println(gasPoweredCar.startEngine());

        System.out.println(gasPoweredCar.drive());

        CarSkeleton electricCar = new ElectricCar("Volvo", "XC40",5.5,100);

        System.out.println(electricCar.startEngine());

        System.out.println(electricCar.drive());

        CarSkeleton tesla = new HybridCar("Tesla", "It makes your dream true",3.5,120,4);

        System.out.println(tesla.startEngine());

        System.out.println(tesla.drive());


    }
}

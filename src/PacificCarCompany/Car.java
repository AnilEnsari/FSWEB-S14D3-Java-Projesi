package PacificCarCompany;

import java.util.Objects;

public class Car {
  private  boolean engine ;
    private int cylinders ;
    private String name ;
    private int wheels ;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public boolean equals(Car car) {
        return car.getName().equals(getName()) && car.getCylinders() == getCylinders();

    }
    public String  startEngine (){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String  accelerate (){
        System.out.println(getClass().getSimpleName());

        return "the car is accelerating ";
    }
    public String  brake (){
        System.out.println(getClass().getSimpleName());
        return "the car is braking ";
    }



}

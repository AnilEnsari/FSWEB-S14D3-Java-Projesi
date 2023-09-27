package PacificCarCompany;

public class Holden extends Car{
    public Holden (int Cylinder , String name){
        super ( Cylinder,name);
    }
    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());

        return "Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());

        return "Holden is accelerating ";    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName());

        return "Holden is braking ";

    }
}

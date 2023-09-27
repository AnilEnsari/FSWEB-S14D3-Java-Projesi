package CarRandDCompany;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders ;
    public GasPoweredCar(String name,String description,double avgKmPerLitre,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return  "GasPoweredCar's engine is starting";
    }

    @Override
    public String drive(){
        System.out.println(getClass().getSimpleName());
        return  runEngine()+ "\nGasPoweredCar is being driven";
    }
}

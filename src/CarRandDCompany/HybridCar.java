package CarRandDCompany;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;

    private double batterySize;
    private int cylinders ;
    public HybridCar(String name,String description,double avgKmPerLitre,double batterySize,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }
    public double getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(double batterySize) {
        this.batterySize = batterySize;
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
        return  "HybridCar's engine is starting";
    }

    @Override
    public String drive(){
        System.out.println(getClass().getSimpleName());
        runEngine();
        return  "HybridCar is being driven";
    }
}

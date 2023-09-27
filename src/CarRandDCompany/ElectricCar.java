package CarRandDCompany;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize ;
    public ElectricCar(String name,String description,double avgKmPerCharge,int batterySize){
        super(name,description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return  "ElectricCar's engine is starting";
    }

    @Override
    public String drive(){
        System.out.println(getClass().getSimpleName());
        return  runEngine()+"\nElectricCar is being driven";
    }
}

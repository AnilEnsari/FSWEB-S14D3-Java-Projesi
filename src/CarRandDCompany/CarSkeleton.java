package CarRandDCompany;

public class CarSkeleton {
   private String name ;
    private String description ;
    public CarSkeleton(String name, String description){
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return  "The car's engine is starting";
    }
    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return  "The car's engine is running";
    }
    public String drive(){
        System.out.println(getClass().getSimpleName());

        return runEngine()+ "\nThe car is being driven";
    }


}

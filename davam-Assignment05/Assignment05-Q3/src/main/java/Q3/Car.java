package Q3;


public abstract class Car {
    private String make="";
    private String model="";

    public Car(String make,String model){
        this.make=make;
        this.model=model;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    abstract double fuelEfficiency();

    abstract double range();
}

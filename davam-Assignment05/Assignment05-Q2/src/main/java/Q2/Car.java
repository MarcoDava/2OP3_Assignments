package Q2;


public abstract class Car {
    String make="";
    String model="";

    Car(String make,String model){
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

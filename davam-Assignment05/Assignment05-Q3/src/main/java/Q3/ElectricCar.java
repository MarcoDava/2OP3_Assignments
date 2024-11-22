
package Q3;


public class ElectricCar extends Car implements Refuel{

    private String make="";
    private String model="";
    private double batteryCapacity=0;
    private double milesPerKWH=0;
    private double fuelLevel=0;

    public ElectricCar(String make, String model,double batteryCapacity,double milesPerKWH){
        super(make,model);
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWH=milesPerKWH;
    }
    double fuelEfficiency(){
        return milesPerKWH;
    }
    double range(){
        return milesPerKWH*batteryCapacity;
    }
    @Override
    public void refuelCar(){
        fuelLevel=batteryCapacity;
    }

}

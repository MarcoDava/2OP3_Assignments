package Q6;

public class ElectricCar extends Car implements Refuel{

    private String make;
    private String model;
    private double batteryCapacity=0;
    private double milesPerKWH=0;
    private double fuelLevel=0;

    public ElectricCar(String make, String model,double batteryCapacity,double milesPerKWH){
        super(make,model);
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWH=milesPerKWH;
        this.fuelLevel=0;
    }
    @Override
    public double fuelEfficiency(){
        return milesPerKWH;
    }
    @Override
    public double range(){
        return milesPerKWH*batteryCapacity;
    }
    @Override
    public void printInformation(){
        System.out.println("make: "+getMake()+"\tmodel: "+getModel()+"\tFuel Efficiency: "+Math.round(fuelEfficiency()*100)/100+"km/KWH\tRange: "+Math.round(range()*100)/100+"km");
    }
    @Override
    public void refuelCar(){
        fuelLevel=batteryCapacity;
    }
}

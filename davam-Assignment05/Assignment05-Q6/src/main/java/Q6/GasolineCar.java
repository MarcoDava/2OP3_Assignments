package Q6;


public class GasolineCar extends Car implements Refuel{
    private String make;
    private String model;
    private double fuelTankCapacity=0;
    private double milesPerGallon=0;
    private double fuelLevel=0;

    public GasolineCar(String make, String model, double fuelTankCapacity, double milesPerGallon){
        super(make,model);
        this.fuelTankCapacity=fuelTankCapacity;
        this.milesPerGallon=milesPerGallon;
        this.fuelLevel=0;
    }
    @Override
    public double fuelEfficiency(){
        return fuelTankCapacity;
    }
    @Override
    public double range(){
        return fuelTankCapacity*milesPerGallon;
    }
    @Override
    public void printInformation(){
        System.out.println("make: "+getMake()+"\tmodel: "+getModel()+"\tFuel Efficiency: "+Math.round(fuelEfficiency()*100)/100+"km/Gallon\tRange: "+Math.round(range()*100)/100+"km");
    }
    @Override
    public void refuelCar(){
        fuelLevel=fuelTankCapacity;
    }

}

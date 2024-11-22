package Q3;


public class GasolineCar extends Car implements Refuel{
    private String make="";
    private String model="";
    private double fuelTankCapacity=0;
    private double milesPerGallon=0;
    private double fuelLevel=0;

    public GasolineCar(String make, String model, double fuelTankCapacity, double milesPerGallon){
        super(make,model);
        this.fuelTankCapacity=fuelTankCapacity;
        this.milesPerGallon=milesPerGallon;
    }
    double fuelEfficiency(){
        return fuelTankCapacity;
    }
    double range(){
        return fuelTankCapacity*milesPerGallon;
    }
    @Override
    public void refuelCar(){
        fuelLevel=fuelTankCapacity;
    }

}

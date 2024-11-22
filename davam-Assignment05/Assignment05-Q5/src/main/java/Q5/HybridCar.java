package Q5;

public class HybridCar extends Car implements Refuel{
    private String make;
    private String model;
    private double fuelTankCapacity=0;
    private double batteryCapacity=0;
    private double milesPerGallon=0;
    private double milesPerKWH=0;
    private double gasLevel=0;
    private double batteryLevel=0;
    private boolean gasOnly=false;


    public HybridCar(String make, String model, double milesPerGallon, double milesPerKWH, double fuelTankCapacity, double batteryCapacity){
        super(make,model);
        this.fuelTankCapacity=fuelTankCapacity;
        this.batteryCapacity=batteryCapacity;
        this.milesPerGallon=milesPerGallon;
        this.milesPerKWH=milesPerKWH;
        this.gasLevel=0;
        this.batteryLevel=0;
    }
    public HybridCar(String make, String model, double milesPerFuel, double Capacity,boolean gasOnly){
        super(make,model);
        this.gasOnly=gasOnly;
        if(gasOnly){
            fuelTankCapacity=Capacity;
            milesPerGallon=milesPerFuel;
            gasLevel=0;
        }
        else{
            batteryCapacity=Capacity;
            milesPerKWH=milesPerFuel;
            batteryLevel=0;
        }
    }
    @Override
    public double fuelEfficiency(){
        if(fuelTankCapacity>0&&batteryCapacity>0){
            return (milesPerKWH+milesPerGallon)/2;  
        }
        else if(gasOnly){
            return milesPerGallon;
        }
        return milesPerKWH;
    }
    @Override
    public double range(){
        if(fuelTankCapacity>0&&batteryCapacity>0){
            return milesPerKWH*batteryCapacity+fuelTankCapacity*milesPerGallon;
        }
        else if(gasOnly){
            return milesPerGallon*fuelTankCapacity;
        }
        return milesPerKWH*batteryCapacity;
        
    }
    @Override
    public void printInformation(){
        if(fuelTankCapacity>0&&batteryCapacity>0){
            System.out.println("make: "+getMake()+"\tmodel: "+getModel()+"\tFuel Efficiency: "+Math.round(fuelEfficiency()*100)/100+"km/Fuel Units\tRange: "+Math.round(range()*100)/100+"km");
        }
        else if(gasOnly){
            System.out.println("make: "+getMake()+"\tmodel: "+getModel()+"\tFuel Efficiency: "+Math.round(fuelEfficiency()*100)/100+"km/Gallon\tRange: "+Math.round(range()*100)/100+"km");
        }
        else{
        System.out.println("make: "+getMake()+"\tmodel: "+getModel()+"\tFuel Efficiency: "+Math.round(fuelEfficiency()*100)/100+"km/KWH\tRange: "+Math.round(range()*100)/100+"km");
        }    
    }
    @Override
    public void refuelCar(){
        if(fuelTankCapacity>0&&batteryCapacity>0){
            gasLevel=fuelTankCapacity;
            batteryLevel=batteryCapacity;
        }
        else if(gasOnly){
            gasLevel=fuelTankCapacity;
        }
        batteryLevel=batteryCapacity;
    }
}

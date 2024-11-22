package Q6;

public abstract class LuxuryCar extends Car implements Refuel{
    private String make="";
    private String model="";
    private double milesPerGallon;
    private double fuelTankCapacity;
    private double price;
    private boolean selfDrive=false;
    private boolean sunRoof=false;
    private double fuelLevel;
    
    public LuxuryCar(String make, String model, double milesPerGallon, double fuelTankCapacity, double price, boolean selfDrive, boolean sunRoof){
        super(make,model);
        this.milesPerGallon=milesPerGallon;
        this.fuelTankCapacity=fuelTankCapacity;
        this.price=price;
        this.selfDrive=selfDrive;
        this.sunRoof=sunRoof;
        fuelLevel=0;
    }
    public double fuelEfficiency(){
        return fuelTankCapacity;
    }

    public double range(){
        return fuelTankCapacity*milesPerGallon;
    }

    public void printInformation(){
        System.out.println("make: "+getMake()+"\tmodel: "+getModel()+"\tFuel Efficiency: "+Math.round(fuelEfficiency()*100)/100+"km/Gallon\tRange: "+Math.round(range()*100)/100+"km\tSelf Drive: "+selfDrive);
    }
    public abstract void flexCar();

    public abstract void selfDriving();

    public abstract void openSunRoof();
    @Override
    public void refuelCar(){
        fuelLevel=fuelTankCapacity;
    }

}

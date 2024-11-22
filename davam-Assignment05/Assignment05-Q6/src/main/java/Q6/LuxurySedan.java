package Q6;

public class LuxurySedan extends LuxuryCar {
    private String make="";
    private String model="";
    private double milesPerGallon;
    private double fuelTankCapacity;
    private double price;
    private boolean selfDrive=false;
    private boolean sunRoof=false;
    private double fuelLevel;
    
    public LuxurySedan(String make, String model, double milesPerGallon, double fuelTankCapacity, double price, boolean selfDrive, boolean sunRoof){
        super(make,model,milesPerGallon,fuelTankCapacity,price,selfDrive,sunRoof);
        fuelLevel=0;
    }

    public void flexCar(){
        System.out.println("*Revving Engine*\nThis car is worth $"+price);
    }

    public void selfDriving(){
        if(selfDrive){
            System.out.println("*Starts Self-Driving*");
        }
        else{
            System.out.println("This car cannot self drive ):");
        }
    }

    public void openSunRoof(){
        if(sunRoof){
            System.out.println("*Opens sun roof*");
        }
        else{
            System.out.println("This car does not have a sun roof ):");
        }
    }

}
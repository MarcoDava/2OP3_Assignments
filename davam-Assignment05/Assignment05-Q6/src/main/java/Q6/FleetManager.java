package Q6;
import java.util.ArrayList;
import java.util.List; 

public class FleetManager {
    public static void main(String[] args) {
        List<Car> fleet = new ArrayList<>();
        fleet.add(new ElectricCar("Tesla","Model 3",75.0,4.0));
        fleet.add(new ElectricCar("Nissan","Leaf",40.0,3.5));
        fleet.add(new GasolineCar("Toyota","Camry",15.0,25.0));
        fleet.add(new GasolineCar("Ford","F-150",26.0,15.0));
        fleet.add(new HybridCar("Toyota","Prius Hybrid",56.0,2.5,11.3,1.3));
        fleet.add(new HybridCar("Ford","Escape Hybrid",56.0,11.3,true));
        fleet.add(new LuxurySedan("BMW","i7",37.0,88.0,119300,true,true));

        for (Car car : fleet) {
            car.printInformation();
        }
        double totalRange=rangeSum(fleet);
        System.out.println("Total range of the fleet is: "+totalRange); 
    }
    public static double rangeSum(List<Car> fleet){
        double totalRange=0;
        for (Car car : fleet){
            totalRange+=car.range();
        }
        return Math.round(totalRange*100)/100;
    }
}

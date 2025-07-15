package vehicle;
import java.util.*;
public class VehicleManager {
    // private List<Car> CarList=new ArrayList<>();
    // private List<Bike> BikeList=new ArrayList<>();
    //private List<Vehicles> VehicleList=new ArrayList<>();
    private Map<String,Vehicles> VehicleList=new HashMap<>();
    public void AddVehicle(Vehicles vehicle)
    {
        // if(vehicle instanceof Car)
        // {
        //     CarList.add((Car)vehicle);
        // }
        // if(vehicle instanceof Bike)
        // {
        //     BikeList.add((Bike)vehicle);
        // }
        VehicleList.put(vehicle.getVehicleId(),vehicle);
        System.out.println("Added vehicle:"+vehicle);
    }
    public void listAllCars()
    {
        for(Vehicles car:VehicleList.values())
        {
            if(car instanceof Car)
            {
                System.out.println(car);
            }
            
        }
    }
    public void listAllBikes()
    {
        for(Vehicles bike:VehicleList.values())
        {
            if(bike instanceof Bike)
            {
                System.out.println(bike);
            }
            
        }
    }
    public void removeVehicle(String vehicleId)
    {
        VehicleList.remove(vehicleId);
    }
    public void VehicleInfo(String vehicleId)
    {
        if(VehicleList.get(vehicleId)!=null)
        System.out.println(VehicleList.get(vehicleId));
        else
        System.out.println("Not Found");
    }
    public void getAvailableCars()
    {
        for(Vehicles car:VehicleList.values())
        {
            if(car instanceof Car&&car.isAvailable)
            {
                System.out.println(car);
            }
        }
    }
}

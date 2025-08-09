package com.revrentals.revrentals.vehicle;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {
    //private List<Vehicles> vehicleList=new ArrayList<>();
    private Map<String,Vehicles> VehicleList=new HashMap<>();

    @GetMapping("/vehicle")
    public Map<String,Vehicles> allVehicles()
    {
        return VehicleList;
    }
   @PostMapping("/vehicle")
    public void AddVehicle(@RequestBody Vehicles vehicle)
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
    @GetMapping("vehicle/cars")
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
    @GetMapping("vehicle/bikes")
    public Vehicles listAllBikes()
    {
        for(Vehicles bike:VehicleList.values())
        {
            if(bike instanceof Bike)
            {
                return bike;
            }
            
        }
        return null;
    }
    public void removeVehicle(String vehicleId)
    {
        VehicleList.remove(vehicleId);
    }
    @GetMapping("/vehicle/{vehicleId}")
    public ResponseEntity<Vehicles>  VehicleInfo(@PathVariable String vehicleId)
    {
        // if(VehicleList.get(vehicleId)!=null){
        // System.out.println(VehicleList.get(vehicleId));
        // return VehicleList.get(vehicleId);
        // }
        // else
        // return null;
        // //System.out.println("Not Found");
        Vehicles vehicle=VehicleList.get(vehicleId);
        if(vehicle!=null)
        return ResponseEntity.ok(vehicle);
        else
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/vehicle/cars/available")
    public Vehicles getAvailableCars()
    {
        for(Vehicles car:VehicleList.values())
        {
            if(car instanceof Car&&car.isAvailable())
            {
                System.out.println(car);
                return car;
            }
        }
        return null;
    }
    
    
}

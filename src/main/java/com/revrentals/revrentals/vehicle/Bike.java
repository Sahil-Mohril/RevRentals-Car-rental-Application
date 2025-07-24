package com.revrentals.revrentals.vehicle;

import  java.math.BigDecimal;
import java.time.Duration;

public class Bike extends Vehicles{
    private FuelType fuel;
    private final BigDecimal rentPerHour=BigDecimal.valueOf(150);
    public Bike(String id,String brand,String model,BigDecimal rentperday)
    {
        super(id,brand,model,rentperday);
        this.fuel=FuelType.Petrol;

    }
    public void displayInfo()
    {
         System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Rent/Day: " + rentPerDay  +
                ", Available: " + isAvailable);
    }
    public BigDecimal calculateRent(Duration duration)
    {
         BigDecimal hrs=BigDecimal.valueOf(duration.toHours());
        BigDecimal days=BigDecimal.valueOf(duration.toDays());
        if(duration.toHours()<=12)
        {
            return hrs.multiply(rentPerHour);
        }
        return days.multiply(rentPerDay);
    }
    @Override
    public String toString()
    {
        if(this==null) return "Not Found";
        return "Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Rent/Day: " + rentPerDay +
                ", Available: " + isAvailable;
    }
}


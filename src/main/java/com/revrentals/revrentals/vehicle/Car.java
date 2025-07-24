package com.revrentals.revrentals.vehicle;

import java.math.BigDecimal;
import java.time.Duration;

public class Car extends Vehicles{
    private int seatingCapacity;
    private FuelType fuel;
    private final BigDecimal rentperhour=BigDecimal.valueOf(1200);

    public Car(String id,String brand,String model,int seat,FuelType fuel,BigDecimal rentperday)
    {
        super(id,brand,model,rentperday);
        this.seatingCapacity=seat;
        this.fuel=fuel;

    }
    public void displayInfo()
    {
         System.out.println("Car ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Rent/Day: " + rentPerDay + ", Fuel: " + fuel + ", Seats: " + seatingCapacity +
                ", Available: " + isAvailable);
    }
    public BigDecimal calculateRent(Duration duration)
    {
        BigDecimal hrs=BigDecimal.valueOf(duration.toHours());
        BigDecimal days=BigDecimal.valueOf(duration.toDays());
        if(duration.toHours()<=12)
        {
            return hrs.multiply(rentperhour);
        }
        return days.multiply(rentPerDay);
        //return rentPerDay.multiply(BigDecimal.valueOf(days));
    }
    @Override
    public String toString()
    {
         if(this==null) return "Not Found";
        return "Car ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Rent/Day: " + rentPerDay + ", Fuel: " + fuel + ", Seats: " + seatingCapacity +
                ", Available: " + isAvailable;
    }
}



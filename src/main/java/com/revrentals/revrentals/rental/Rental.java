package com.revrentals.revrentals.rental;


import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

import com.revrentals.revrentals.user.User;
import com.revrentals.revrentals.vehicle.Vehicles;

public class Rental {
    private String rentalId;
    private User user;
    private Vehicles vehicle;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal totalCost;
    private BigDecimal distanceDriven=BigDecimal.ZERO;

    public Rental(String rentalId,User user,Vehicles vehicle,LocalDateTime startdate,LocalDateTime endDate)
    {
        this.rentalId=rentalId;
        this.user=user;
        this.vehicle=vehicle;
        this.startDate=startdate;
        this.endDate=endDate;
    }
    public BigDecimal CalculateCost()
    {
        Duration duration=Duration.between(startDate, endDate);
        return this.vehicle.calculateRent(duration);
    }
    public void Bookingdetails()
    {
        System.out.println("UserId: "+user.getUserId()+
                            "\nName: "+user.getName()+
                            "\nEmail: "+user.getemail()+
                            "\n\nStartDate: "+startDate+
                            "\nEndDate: "+endDate
                            );
        System.out.println(vehicle);
        System.out.println("Total cost: "+CalculateCost());
    }
    

}


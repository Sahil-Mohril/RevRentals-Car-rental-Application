package com.revrentals.revrentals.vehicle;

import java.math.BigDecimal;
import java.time.Duration;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Car.class, name = "car"),
    @JsonSubTypes.Type(value = Bike.class, name = "bike")
})
public abstract  class Vehicles {
    protected String vehicleId;
    protected String brand;
    protected String model;
    protected BigDecimal rentPerDay;
    protected boolean isAvailable;
     
    public Vehicles(String vehicleId, String brand, String model, BigDecimal rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true; 
    }
    public abstract void displayInfo();
    public abstract BigDecimal calculateRent(Duration duration);

      public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

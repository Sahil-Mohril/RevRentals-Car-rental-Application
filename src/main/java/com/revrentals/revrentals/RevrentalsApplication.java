package com.revrentals.revrentals;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revrentals.revrentals.vehicle.Bike;
import com.revrentals.revrentals.vehicle.Car;
import com.revrentals.revrentals.vehicle.FuelType;
import com.revrentals.revrentals.vehicle.VehiclesController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class RevrentalsApplication {
		@Autowired
	private VehiclesController manager;
	public static void main(String[] args) {
		SpringApplication.run(RevrentalsApplication.class, args);
	}
	@PostConstruct
	public void init() {
		
		manager.AddVehicle(new Car("C001", "Toyota", "Innova", 7, FuelType.Diesel, new BigDecimal("1800")));
		manager.AddVehicle(new Bike("B002", "Royal Enfield", "Classic 350", new BigDecimal("700")));
		manager.getAvailableCars();
	}

}

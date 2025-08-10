package com.revrentals.revrentals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revrentals.revrentals.vehicle.Vehicles;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicles, String> {
    
    List<Vehicles> findByBrand(String brand);
    List<Vehicles> findByModel(String model);
}

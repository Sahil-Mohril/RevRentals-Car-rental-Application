import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import rental.Rental;
import user.User;
import vehicle.Bike;
import vehicle.Car;
import vehicle.FuelType;
import vehicle.Vehicles;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Vehicles car1=new Car("C001","Hyundai","i20 sports",5,FuelType.Petrol,BigDecimal.valueOf(3999));
        Vehicles car2=new Car("C002","Honda","city",5,FuelType.Petrol,BigDecimal.valueOf(4999));
        Vehicles bike1=new Bike("B001","Bajaj","Splendor",BigDecimal.valueOf(1999));
        //System.out.println(bike1);
        // VehicleManager manager=new VehicleManager();
        // manager.AddVehicle(car1);
        // manager.AddVehicle(car2);
        // manager.listAllCars();
        // manager.AddVehicle(bike1);
        // manager.listAllBikes();
        // //manager.removeVehicle("C001");
        // manager.listAllCars();
        // manager.VehicleInfo("C002");
        // manager.AddVehicle(new Car("C003","Mahindra","Thar",5,FuelType.Diesel,BigDecimal.valueOf(5999)));
        // car2.setAvailable(false);
        // manager.getAvailableCars();

        User user=new User("123","Sahil MOhril","sahilmohril@gmail.com","Sahil1234");
        //System.out.println(user);

        Rental booking=new Rental("1102", user, bike1, LocalDateTime.of(2025, Month.JULY, 16, 11, 0),
         LocalDateTime.of(2025, Month.JULY, 19, 5, 0));
        //  LocalDateTime d1=LocalDateTime.of(2025, Month.JULY, 16, 11, 0);
        //  LocalDateTime d2= LocalDateTime.of(2025, Month.JULY, 19, 5, 0);
        // //  BigDecimal b=booking.CalculateCost();
        // System.out.println(d2);
        // System.out.println(Duration.between(d2, d1));
        booking.Bookingdetails();
    }
}

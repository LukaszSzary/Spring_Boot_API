package example.API.Controller;

import example.API.Entities.Car;
import example.API.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class CarController {
    @Autowired
    private final CarService carService;
    public CarController(CarService carService){
        this.carService=carService;
    }

    @GetMapping("/allCars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/getCar")
    public Optional<Car> getCar(@RequestParam("id") UUID id){
        return carService.getCar(id);
    }
    @PostMapping("/addCar")
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }
    @PutMapping("/updateCar")
    public void updateCar(@RequestBody Car car){
        carService.updateCar(car);
    }

    @DeleteMapping("/deleteCar")
    public void deleteCar(@RequestParam("id") UUID id){
        carService.deleteCar(id);
    }
}

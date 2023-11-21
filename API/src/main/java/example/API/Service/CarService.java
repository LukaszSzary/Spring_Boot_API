package example.API.Service;

import example.API.Entities.Car;
import example.API.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarService {

    private final CarRepository carRepository;
    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository=carRepository;
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Optional<Car> getCar(UUID id){

        carRepository.findAll();
        return carRepository.findById(id);
    }

    public void addCar(Car car){
        carRepository.save(car);
    }
    public void updateCar(Car car){
        Car carToUpdate= carRepository.getReferenceById(car.getId());
        carToUpdate=car;
        carRepository.save(carToUpdate);
    }
    public void deleteCar(UUID id){
        carRepository.deleteById(id);
    }
}

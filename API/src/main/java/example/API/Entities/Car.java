package example.API.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Cars")
public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;
    private String brand;
    private String model;
    private Integer doorsNumber;
    private Integer luggageCapacity;
    private Integer engineCapacity;
    private enums.FuelType fuelType;
    private Date productionDate;
    private Double carFuelConsumption;
    private enums.BodyType bodyType;
    public UUID getId() {  return id; }
    public void setId(UUID Id) { this.id = Id; }
    public String getBrand() {  return brand; }
    public void setBrand(String Brand) { this.brand =Brand ; }
    public String getModel() {  return model; }
    public void setModel(String Model) { this.model =Model ; }
    public Integer getDoorsNumber() {  return doorsNumber; }
    public void setDoorsNumber(Integer DoorsNumber) { this.doorsNumber = DoorsNumber ; }
    public Integer geLuggageCapacity() {  return luggageCapacity ; }
    public void setLuggageCapacity(Integer LuggageCapacity) { this.luggageCapacity = LuggageCapacity; }
    public Integer getEngineCapacity() {  return engineCapacity; }
    public void setEngineCapacity(Integer EngineCapacity) { this.engineCapacity = EngineCapacity; }
    public enums.FuelType getFuelType() {  return fuelType; }
    public void setFuelType(enums.FuelType FuelType) { this.fuelType = FuelType; }
    public Date getProductionDate() {  return productionDate; }
    public void setProductionDate(Date ProductionDate) { this.productionDate = ProductionDate; }
    public Double getCarFuelConsumption() {  return carFuelConsumption; }
    public void setCarFuelConsumption(Double CarFuelConsumption) { this.carFuelConsumption = CarFuelConsumption; }
    public enums.BodyType getBodyType() {  return bodyType; }
    public void setBodyType(enums.BodyType BodyType) { this.bodyType = BodyType; }
    }
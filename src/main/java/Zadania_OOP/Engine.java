package Zadania_OOP;

import lombok.Getter;
import lombok.Setter;

public class Engine {
    private Double capacity;
    @Getter
    @Setter
    private Integer horsePower;
    @Getter
    @Setter
    private Double fuelConsumption;

    public Engine (Double capacity, Integer horsePower, Double fuelConsumption){
        this.capacity = capacity;
        this. horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    public void setCapacity(Double capacity){
        this.capacity = capacity;
    }
    public Double getCapacity(){
        return this.capacity;
    }
    
}

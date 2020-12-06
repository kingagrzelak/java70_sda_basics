package Zadania_OOP;

import lombok.Getter;
import lombok.Setter;

public abstract class Car {
    @Getter
    @Setter
    private String producer;
    @Getter
    @Setter
    private String color;
    @Getter
    @Setter
    private String model;
    @Getter
    @Setter
    private Integer seatsNumber;
    private Engine myEngine; //kompozycja

    public void setMyEngine(Engine myEngine1){
        this.myEngine = myEngine1;
    }

    public Engine getEngine (){
        return this.myEngine;
    }
    public Car (String producer, String model, String color, Integer seatsNumber, Engine myEngine){
        this.producer = producer;
        this. model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.myEngine = myEngine;
    }
}

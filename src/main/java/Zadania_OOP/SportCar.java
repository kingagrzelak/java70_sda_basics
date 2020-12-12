package Zadania_OOP;

public class SportCar extends Car implements LoudCar {
    public SportCar (String producer, String model, String color, Engine myEngine){
        super(producer, model, color, 2, myEngine);

    }


    public SportCar (String producer, String model, String color, Integer seatsNumber, Engine myEngine){
        super(producer, model, color, seatsNumber, myEngine);

    }

    @Override
    public String loudBrum() {
        return "Brrrrum";
    }


}

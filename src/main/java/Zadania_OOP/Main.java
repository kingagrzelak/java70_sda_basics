package Zadania_OOP;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(12.05d, 1200, 15.25);
        SportCar sportCar = new SportCar("Opel", "Corsa", "red", 2, engine);
        System.out.println(sportCar.loudBrum());
    }
}

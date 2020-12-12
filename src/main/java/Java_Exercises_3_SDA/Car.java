package Java_Exercises_3_SDA;

public class Car implements Movable{

    @Override
    public String move(){
        System.out.println("Jadę ale jakby wcześniej");
        return "Jadę";
    }
}

package Java_Exercises_3_SDA;

import lombok.Getter;
import lombok.Setter;

public class Cat implements AnimalSounds, Movable {
    private String name;
    private Integer miceCounter;

    public Cat(String name) {
        this.name = name;
        this.miceCounter = 0;
    }

    public Cat(String name, Integer miceCounter) {
        this.name = name;
        this.miceCounter = miceCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMiceCounter(Integer miceCounter) {
        this.miceCounter = miceCounter;
    }

    public Integer getMiceCounter() {
        return this.miceCounter;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " goes meow!!!!");
    }


    public void eatMouse() {
        this.miceCounter++;
        //this.miceCounter = this.miceCounter + 1;
        System.out.println("Zjadłem myszy" + miceCounter + "myszy");
    }

    @Override
    public String move(){
        System.out.println("Idę wcześniej");
        return "Idę";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", miceCounter=" + miceCounter +
                '}';
    }
}

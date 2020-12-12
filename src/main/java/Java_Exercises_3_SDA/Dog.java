package Java_Exercises_3_SDA;

public class Dog implements AnimalSounds {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " woff woff");
    }
}

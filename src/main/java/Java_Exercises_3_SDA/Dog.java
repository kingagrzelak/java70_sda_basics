package Java_Exercises_3_SDA;

public class Dog extends AbstractAnimal implements AnimalSounds {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " woff woff");
    }
}

package Java_Exercises_3_SDA;

public class Vet {

    public void sayHello(Cat someCat){
        System.out.println("Witaj kocie " + someCat.getName());
    }

    public void sayHello(Dog someDog){
        System.out.println("Witaj piesku " + someDog.getName());
    }
}

package collections;

public class Main {
    public static void main(String[] args) {
        Exercise1 myArray = new Exercise1(25);
        myArray.addToArray();
        myArray.printArray();
        System.out.println(myArray.getArraySize());
        myArray.printArraySize();
        myArray.multiplication(10);
        myArray.printArray();
    }
}

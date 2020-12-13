package collections_new;

public class Main {
    public static void main(String[] args) {
        Exercise2 myList = new Exercise2();
        myList.addElementList(2,3,4,5,6);
        System.out.println(myList.listLength());
        myList.addElementList(7,8);
        System.out.println(myList.listLength());
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.printList();
    }
}

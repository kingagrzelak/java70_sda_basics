package collections_training;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void trainSet(){
        String name1 = "Basia";
        String name2 = "Kasia";
        String name3 = "Ala";
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);
        System.out.println(uniqueNames.size());
        uniqueNames.add(name1);
        System.out.println(uniqueNames.size());
    }
}

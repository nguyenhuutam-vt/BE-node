import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {
        //create a list
        Set<String> fruit = new HashSet<>();

        //add elements
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Apple");

        //get the size of the list
        int size = fruit.size();
        System.out.println("Size of the list " +size);

       //check if an element exist in the set
        boolean containsApple = fruit.contains("Apple");
        System.out.println("Does the set contain Apple " +containsApple);

        //Iterate over the element in the set
        System.out.println("Element in the set ");
        for (String fruits : fruit){
            System.out.println(fruits);
        }

        //remove
        boolean removed = fruit.remove("Orange");
        System.out.println("removed Orange " + removed);
        System.out.println("update " + fruit);

        //clrear
        fruit.clear();
        System.out.println("clear " + fruit.size());

    }
}

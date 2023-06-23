import java.util.ArrayList;
import java.util.List;

public class Listt {
    public static void main(String[] args) {
        //create a list
        List<String> fruit = new ArrayList<>();

        //add elements
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");

        //get the size of the list
        int size = fruit.size();
        System.out.println("Size of the list " +size);

        //Access element in the list
        String firstFruit = fruit.get(0);
        System.out.println("First fruit " + firstFruit );

        //modify element
        fruit.set(1,"Mango");
        System.out.println("Modified list " + fruit );

        //iterate over the element in the list
        System.out.println("Element in the list ");
        for (String fruits : fruit){
            System.out.println(fruits);
        }

        //remove an element
        boolean removed = fruit.remove("Orange");
        System.out.println("Is 'Orange' removed " + removed);
        System.out.println("Update list " + fruit);

        // check if the list contain a specific
        boolean contains = fruit.contains("Banana");
        System.out.println("Does the list contain banana"+ contains);

        //clears all elements
        fruit.clear();
        System.out.println("Clear " + fruit.size());
    }
}

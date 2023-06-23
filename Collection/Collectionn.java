import java.util.ArrayList;
import java.util.Collection;

public class Collectionn {
    public static void main(String[] args) {
        //create  a collection array
        Collection<Integer> numbers = new ArrayList<>();

        //add element
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //get size of the collection
        int size =numbers.size();
        System.out.println("Size of the collection" +size);

        //check if the collection
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is empty " + isEmpty);

        // iterate over the elements in the collection
        System.out.println("Element in the collection");
        for (int number : numbers){
            System.out.println(number);
        }

        //remove an element
        boolean removed = numbers.remove(20);
        System.out.println("Is 20 removed " +removed);

        //clear
        numbers.clear();
        System.out.println(numbers);
    }
}

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {
    public static void main(String[] args) {
        //Create an ArrayList
        List<Integer> numbers = new ArrayList<>();

        //Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //Get the size
        int size = numbers.size();
        System.out.println("Size of the ArrayList " + size);

        //Access element in the Arraylist
        int firstNumber = numbers.get(0);
        System.out.println("First number : " +firstNumber);

        //Modifu element
        numbers.set(1,25);
        System.out.println("Modified ArrayList " + numbers);

        //Iterate over
        System.out.println("Element in the ArrayList");
        for (int number : numbers){
            System.out.println(number);
        }

        //removew an element from ArrayList
        boolean removed = numbers.remove(Integer.valueOf(30));
        System.out.println("Is 30 removed ?" +removed);
        System.out.println("Update ArrayList: " +numbers);

        //check if the ArrayList
        boolean contains = numbers.contains(25);
        System.out.println("Does the ArrayList contain 20 ? "+contains);

        //Clear all element from the ArrayList
        numbers.clear();
        System.out.println("Size of the ArrayList after clearing " +numbers.size());

    }
}

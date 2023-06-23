import java.util.HashSet;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();

        //add element to hashSet
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(20);

        //get the size
        int size = number.size();
        System.out.println("Size " + size);

        //iterate
        System.out.println("Element List HashSet ");
        for (int numbers :number){
            System.out.println(numbers);
        }

        //remove
        boolean removed = number.remove(20);
        System.out.println("remove 20 " + removed);

        //check hashSet
        boolean contain = number.contains(20);
        System.out.println("Is 20 ?" +contain);
        System.out.println("Update " + number);

        //clrear
        number.clear();
        System.out.println("Clear " + number.size());


    }
}

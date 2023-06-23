import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer>number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        //cach 1
        for (int numbers : number){
            System.out.println("List 1 " + numbers);

        }
        System.out.println("===============");

        //cach 2
        number.forEach((n) -> System.out.println("List 2 " + n));

        System.out.println("===============");
        //cach 3
        for (int counter = 0; counter < number.size(); counter++) {
            System.out.println(number.get(counter));
        }

        //cach 4
        
    }
}

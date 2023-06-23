import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(List.of("mid"));


        arr.add(0,"head");
        System.out.println("First " +arr);
        arr.add("last");
        System.out.println("Last " +arr);


    }
}

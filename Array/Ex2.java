import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> arr01 = new ArrayList<>();
        arr01.add("a");
        arr01.add("b");
        arr01.add("c");
     //   String position1 = String.valueOf(arr01.stream().findFirst());
        String position1 = arr01.get(0);
        String position2 = arr01.get(arr01.size() -1);
        System.out.println("first " + position1);
        System.out.println("last " + position2);
    }
}

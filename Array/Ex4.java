import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> left = new ArrayList<>();
        left.add("x");
        left.add("y");
        List<String> right = new ArrayList<>();
        right.add("z");
        right.addAll(left);
        left.clear();
        System.out.println("left " +left);
        System.out.println("right "+right);
    }
}

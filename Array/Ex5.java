import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        transform(listString);
        System.out.println(listString);
    }
    public static void transform(List<String> list){
        for(int i = 0; i< list.size(); i++){
            list.set(i,String.valueOf(i));
        }
    }
}

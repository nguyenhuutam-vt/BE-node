import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstt {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add("mid");
        insertFirst(arr,"head");
        insertLast(arr,"last");
        LinkedList<String> arr1 = new LinkedList<String>(List.of("a", "b", "c"));
        remove(arr1,0);
        remove(arr1,1);

        LinkedList<String> left = new LinkedList<String>(List.of("a", "b", "c"));
        ArrayList<String> right = new ArrayList<String>();
        coppy(left,right);

        LinkedList<String> arr2 = new LinkedList<String>(List.of("a", "b", "c"));
        reverse(arr2);
    }
  public static  void insertFirst ( LinkedList<String> arr , String items){
    arr.addFirst(items);
      System.out.println(arr);
  }
    public static  void insertLast ( LinkedList<String> arr , String items){
        arr.addLast(items);
        System.out.println(arr);
    }

    public static void remove (LinkedList<String> arr , int items){
        arr.remove(0);
        System.out.println(arr);
    }
    public static void coppy ( LinkedList<String> left  ,    ArrayList<String> right){
        right.addAll(left);
        left.clear();
        System.out.println("left "+left);
        System.out.println("right"+right);


    }

    public static  void  reverse ( LinkedList<String> arr){
        LinkedList<String> revLinkedList = new LinkedList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add(arr.get(i));
        }

        System.out.println("reverse " + revLinkedList);
    }


}

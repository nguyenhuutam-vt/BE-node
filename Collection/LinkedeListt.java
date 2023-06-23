import java.util.LinkedList;

public class LinkedeListt {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        //add elements to
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //get the size of the linkedList
        int size = names.size();
        System.out.println("Size of the LinkedList " +size);

        //access elements in the LinkList
        String first = names.getFirst();
        String last = names.getLast();
        System.out.println("First element " +first);
        System.out.println("Last element " +last);

        //modify element in the linklist
        names.set(1,"Eve");
        System.out.println("Modified LinkedList " + names);

        //Iterate over  the element in the LinkList
        System.out.println("Element in the LinkedList ");
        for (String name :names){
            System.out.println(name);
        }

        //remove an element
        boolean removed =names.remove("Charlie");
    }
}

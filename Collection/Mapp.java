import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map<String, Integer> studentId = new HashMap<>();

        //Add element to the map
        studentId.put("John" , 101);
        studentId.put("Alice", 102);
        studentId.put("Bob",103);

        //Get the size of the map
        int size = studentId.size();
        System.out.println("Size of the map : " + size);

        //Access elements int the map
        int johnId = studentId.get("John");
        System.out.println("John's ID " +johnId);

        //check if the map cotains a specific key
        boolean containAlice = studentId.containsKey("Alice");
        System.out.println("Does the map contain Alice ? " +containAlice);

        //Iterate over the element in the map
        System.out.println("Element in the map ");
        for(Map.Entry<String, Integer> entry : studentId.entrySet()){
            String name = entry.getKey();
            int id =entry.getValue();
            System.out.println("Name " + name + ", ID " +id);
        }
        //remove an element from the map
        Integer removeId = studentId.remove("Bob");
        System.out.println("Remove Id " + removeId);
        System.out.println("Update map : " +studentId);

        //clear
        studentId.clear();
        System.out.println("Size of the map after clearing : " +studentId.size());
    }
}

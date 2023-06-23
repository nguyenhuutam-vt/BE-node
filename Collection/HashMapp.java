import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        Map<String ,Integer> studentMap = new HashMap<>();

        //Add elements
        studentMap.put("Alice",100);
        studentMap.put("Bob",101);
        studentMap.put("Charlie",102);

        //get the size
        int size = studentMap.size();
        System.out.println("Size " +size);

        //Acceess element
        int aliceID = studentMap.get("Alice");
        System.out.println("ID " + aliceID);

        //check if the Hash
        boolean containID = studentMap.containsKey("Bob");
        System.out.println("Bob ? " +containID);

        //check if the specific
        boolean containValue = studentMap.containsValue(101);
        System.out.println("Bob 101" +containValue);

        //iterate
        System.out.println("List HashMap ");
        for(Map.Entry<String ,Integer> studentMaps : studentMap.entrySet()){
            String name = studentMaps.getKey();
            int id = studentMaps.getValue();
            System.out.println("Name "+ name + ", ID " +id );
        }

        //remove
        Integer removedID = studentMap.remove("Alice");
        System.out.println("removed Alice ?" +removedID );

        //clear
        studentMap.clear();
        System.out.println("Clear " + studentMap.size());


    }
}

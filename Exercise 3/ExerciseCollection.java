import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExerciseCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);        
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Result Q1: ");
        sum(list);
        System.out.println("Result Q2: ");
        hashSet(list);
        System.out.println("Result Q3: ");
        LinkedList<String> arr = new LinkedList<String>(List.of("a", "b", "c"));
        System.out.println(reverse(arr));
        System.out.println("Result Q4: ");
        largeNumber(list);
        System.out.println("Result Q5: ");
        hashMap("Billion", 7);
        System.out.println("Result Q6: ");
        List<String> list2 = new ArrayList<>();
        list2.add("Ay");  
        checkArray(list2, "Ay");
        System.out.println("Result Q7: ");
        ArrayList<String> list7 = new ArrayList<>();
        list7.add("cs");        
        list7.add("aa");
        list7.add("dx");
        list7.add("bc");
        sort(list7);
        System.out.println("Result Q8: ");
        ArrayList<Integer> list8 = new ArrayList<>();
        list8.add(8);        
        list8.add(6);
        list8.add(7);
        list8.add(1);
        treeSet(list8);
        System.out.println("Result Q9: ");
        addToHashMap(list);
        System.out.println("Result Q10: ");
        ArrayList<Integer> list10 = new ArrayList<>();
        list10.add(8);        
        list10.add(6);
        list10.add(7);
        list10.add(8);
        removeDuplicateFromArray(list10);
        System.out.println("Result Q11: ");
        ArrayList<Integer> list11 = new ArrayList<>();
        list11.add(8);        
        list11.add(6);
        list11.add(7);
        copyArrayList(list11);
        System.out.println("Result Q12: ");
        String str = "you you iam ai ai ai"; 
        frequencyOfAppearance(str);
        System.out.println("Result Q13: ");
        // Tạo một danh sách liên kết
        LinkedList<String> list13 = new LinkedList<>();
        // Thêm các phần tử vào danh sách liên kết
        list13.add("apple"); 
        list13.add("orange");       
        list13.add("apple");
        list13.add("apple");
        countFrequencyInLinkedList(list13);
        System.out.println("Result Q14: ");
        ArrayList<String> arr14 = new ArrayList<>();
        arr14.add("sdsd");
        System.out.println(isEmptyArrayList(arr14));
        System.out.println("Result Q15: ");
        ArrayList<Integer> list15 = new ArrayList<>();
        list15.add(1);
        list15.add(2);
        list15.add(4);
        list15.add(5);
        insertAtPosition(list15);
        System.out.println("Result Q16: ");
        ArrayList<Integer> list16 = new ArrayList<Integer>();
        list16.add(5);
        list16.add(3);
        list16.add(8);
        list16.add(1);
        list16.add(2);
        createPriorityQueue(list16);
        System.out.println("\nResult Q17: ");
        ArrayList<Integer> list17 = new ArrayList<>();
        list17.add(1);
        list17.add(2);
        CheckArrayList(list17);
        System.out.println("Result Q18: ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(8);
        linkedList.add(-1);
        sortLinkedList(linkedList);
        System.out.println("Result Q19: ");
        HashSet<String> hSet = new HashSet<String>();
        hSet.add("Apple");
        hSet.add("Banana");
        hSet.add("Ci");        
        hSet.add("Di");        
        hSet.add("Ei");
        createHashSet(hSet);
        System.out.println("Result Q20: ");
        ArrayList<String> list20 = new ArrayList<>();
        list20.add("apple");
        list20.add("orange");
        list20.add("banana");
        list20.add("apple");
        elementArray(list20);
    }
    //1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.
    static void sum(ArrayList<Integer> arrayList){
        int rs =0;
        for (int i :arrayList){
            rs += i;
        }
        System.out.println(rs);
    }
    //2. Viết một chương trình để tạo một HashSet từ một ArrayList.
    static void hashSet(List<Integer> list){
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(list);
        System.out.println(numbers);
    }
    //3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.
    static List<String> reverse(LinkedList<String> linkedList) {
        Collections.reverse(linkedList);
        return linkedList;
    }
    //4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.
    static void largeNumber(ArrayList<Integer> arrayList){
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).compareTo(max) > 0) {
                max = arrayList.get(i);
            }
        }
        System.out.println(max);
    }
    //5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.
    static void hashMap(String name , Integer number){
        Map<String, Integer> student = new HashMap<>();
        student.put(name, number);
        System.out.println(student);
    }
    //6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.
    static void checkArray(List<String> list, String str){
        boolean contains = list.contains(str);
        System.out.println(contains);
    }
    //7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.
    static void sort(ArrayList<String> arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    //8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần.
    static void treeSet(ArrayList<Integer> list){
        TreeSet<Integer> names = new TreeSet<>(list);
        
        System.out.println(names);
    }
    //9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.
    static void addToHashMap(List<Integer> list){
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(list);
        System.out.println(numbers);
    }
    //10. Xóa các phần tử trùng lặp từ một ArrayList.
    static void removeDuplicateFromArray(List<Integer> list){
        Set<Integer> numbers = new HashSet<>(list);
        System.out.println(numbers);
    }
    //11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.
    static void copyArrayList(ArrayList<Integer> arrayList){
        ArrayList<Integer> copyArr = (ArrayList<Integer>)arrayList.clone();
        System.out.println("Array list: " + arrayList);
        System.out.println("Array list clone: " + copyArr);
    }
    //12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.
    static void frequencyOfAppearance(String str){
       TreeMap<String, Integer> wordFrequencies = new TreeMap<>();

        String[] words = str.split("\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                if(wordFrequencies.containsKey(word))
                    wordFrequencies.put(word,wordFrequencies.get(word) + 1);
                else{
                    wordFrequencies.put(word,1);
                }
            }
        }

        for (String word : wordFrequencies.keySet()) {
            int frequency = wordFrequencies.get(word);
            System.out.println(word + " appear " + frequency + " time ");
        }
       
        
    }
    //13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.
    static void countFrequencyInLinkedList(List<String> linkedList) {
        int count = 0;
        for (String element : linkedList) {
            if (element.equals("apple")) {
                count++;
            }
        }
        System.out.println("The number of occurrences of the 'apple' element are:" + count);
    }
    //14. Kiểm tra xem một ArrayList có rỗng hay không.
    static boolean isEmptyArrayList(ArrayList<String> list) {
        boolean result = list.isEmpty();
        return result;
    }
    //15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.
    static void insertAtPosition(ArrayList<Integer> list){
        // Chèn số nguyên 3 vào vị trí thứ 2 của danh sách
        int index = 2;
        int element = 3;
        list.add(index, element);

        // In ra danh sách sau khi chèn phần tử
        System.out.println(list);
    }
    //16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.
    static void createPriorityQueue(ArrayList<Integer> list){
         PriorityQueue<Integer> queue = new PriorityQueue<Integer>(list);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
    //17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.
    public static  void CheckArrayList(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        boolean check = list.containsAll(list2);
        System.out.println("Does list number 1 contain list number 2? " + "\n" + check );
    }
    //18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.
    static void sortLinkedList(LinkedList<Integer> list){
        list.sort(Comparator.comparingInt(o -> (int)o).reversed());
        System.out.println(list);
    }
    //19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.
    static void createHashSet(HashSet<String> hashList){
        System.out.println(hashList);
    }
    //20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.
    static void elementArray(ArrayList<String> list){
        // Lấy phần tử đầu tiên của ArrayList
        String firstElement = list.get(0);
        System.out.println("The first element of the ArrayList:" + firstElement);

        // Lấy phần tử cuối cùng của ArrayList
        int lastIndex = list.size() - 1;
        String lastElement = list.get(lastIndex);
        System.out.println("The last element of the ArrayList:" + lastElement);
    }
}
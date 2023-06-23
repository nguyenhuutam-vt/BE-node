import java.util.*;
import java.util.stream.Collectors;

public class ArrayListt {
    public static void main(String[] args) {
        //1
        ArrayList<Integer> number = new ArrayList<>();
        sum(number);

        //2
        ArrayList<Integer> number2 = new ArrayList<>();
        hashsett(number2);

        //3
        LinkedList<String> string3 = new LinkedList<>();
        linklist(string3);

        //4
        ArrayList<Integer> number4 = new ArrayList<>();
        large(number4);

        //5
        HashMap<String,Integer> string5 = new HashMap<>();
        student(string5);

        //6
        ArrayList<Integer> number6 = new ArrayList<>();
        checkArray(number6);

        //7
        ArrayList<String> string7 = new ArrayList<>();
        sortt(string7);

        //8
        ArrayList<Integer> number8 = new ArrayList<>();
        tree(number8);

        //9
        ArrayList<String> number9 = new ArrayList<>();
        hashSettt(number9);

        //10
        ArrayList<Integer> number10 = new ArrayList<>();
        removeDupicate(number10);

        //11
        ArrayList<Integer> number11 = new ArrayList<>();
        tranfer(number11);

        //12
        System.out.println("==========");
        String str = "chao mung ban den khoa hoc java";
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }


        //13
        LinkedList<Integer> string13 = new LinkedList<>();

        //14
        ArrayList<Integer> number14 = new ArrayList<>();
        checknull(number14);

        //15
        ArrayList<Integer> string15 = new ArrayList<>();
        q15(string15);

        //155
        q155();

        //17
        q17();

        //q18
        q18();

        //q19
        q19();

        //q20
        q20();
    }
    public static void sum( ArrayList<Integer> number){
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        int summ = 0;
        for (int numbers :number){
            summ += numbers;
        }
        System.out.println("tong ArrayList " + summ);
    }
    public static void hashsett(ArrayList<Integer> number2 ) {
        number2.add(1);
        number2.add(2);
        number2.add(3);
        HashSet<Integer> hashset = new HashSet<>(number2);
        System.out.println("HashSet contain " + hashset);
    }

    public  static void linklist(  LinkedList<String> string3){
        string3.add("java");
        string3.add("map");
        string3.add("arrayList");
        string3.add("LinkList");
        Collections.reverse(string3);
        System.out.println("reverse " + string3);
    }

    public  static void large ( ArrayList<Integer> number4 ){
        number4.add(1);
        number4.add(2);
        number4.add(3);
        number4.add(4);

        int max = number4.get(0);
       for (int i = 0 ; i < number4.size() ; i++){
            if(number4.get(i).compareTo(max) > 0){
                max =number4.get(i);
            }
       }
        System.out.println("Large " + max);
    }

    public static void student (    HashMap<String,Integer> string5){
        string5.put("tam",9);
        string5.put("ty",10);
        string5.put("minh",8);
        System.out.println("Student " + string5);
    }

    public static void checkArray (   ArrayList<Integer> number6){
        number6.add(1);
        boolean check = number6.contains(1);
        System.out.println("co phan tu so 1 khong ? " +check);
    }

    public static void  sortt ( ArrayList<String> string7 ){
        string7.add("b");
        string7.add("a");
        string7.add("c");
        string7.add("z");
        Collections.sort(string7);
        System.out.println("Sort " + string7);
    }

    public static void tree ( ArrayList<Integer> number8){
        number8.add(4);
        number8.add(3);
        number8.add(2);
        number8.add(10);
        TreeSet<Integer> number = new TreeSet<>(number8);
        System.out.println("tree " +number);
    }

    public static void  hashSettt ( ArrayList<String> number9){
        number9.add("apple");
        number9.add("banana");
        number9.add("orange");
        HashSet<String> number = new HashSet<>(number9);
        System.out.println("HashSet String " +number );
    }

    public static void removeDupicate (ArrayList<Integer> number10){
        number10.add(1);
        number10.add(1);
        number10.add(2);
        number10.add(3);
        number10.add(4);
        List listwithouDuplicate = number10.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove Duplicate " + listwithouDuplicate);
    }

    public static void tranfer (ArrayList<Integer> number11){
        number11.add(1);
        number11.add(2);
        number11.add(3);
        number11.add(4);
        number11.add(5);
        ArrayList<Integer> number= new ArrayList<>(number11);
        number11.clear();
        System.out.println("array new "+number);
        System.out.println("array old " + number11);


    }

    public static Map<String, Integer> countWords(String input) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != ' ' && input.charAt(i) != '\t'
                    && input.charAt(i) != '\n') {
                // build một từ
                sb.append(input.charAt(i));
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }

    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }


//    public static void  q13 (  LinkedList<Integer> string13){
//        string13.add(1);
//        string13.add(1);
//        string13.add(2);
//        string13.add(2);
//        string13.add(2);
//        string13.add(2);
//        string13.add(3);
//        string13.add(4);
//        string13.add(4);
//        int [] arr = new int [string13.size()];
//        LinkedList<Integer> string= new LinkedList<Integer>();
//        for (int i = 0; i < string13.size(); i++) {
//            addElement((Map<Integer, Integer>) string, arr[i]);
//        }
//        for (Integer key : string.get()) {
//            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
//        }
//    }
//
//    public static void addElement(Map<Integer, Integer> map, int element) {
//        if (map.containsKey(element)) {
//            int count = map.get(element) + 1;
//            map.put(element, count);
//        } else {
//            map.put(element, 1);
//        }
//    }

    public static void checknull (ArrayList<Integer> number14){
        number14.add(1);
        boolean number = number14.isEmpty();
        System.out.println("empty ? " +number);
    }

    public static  void q15( ArrayList<Integer> string15){
    string15.add(2);
    string15.add(1);
    string15.add(3);
    PriorityQueue<Integer> queue = new PriorityQueue<>(string15);
        System.out.println("priority " + queue);


    }

    public static void insertElement(ArrayList<String> myList, String newElement, int index) {
        myList.add(index, newElement);
    }
    public static void q155(){
        ArrayList<String> string15 = new ArrayList<>();
        string15.add("1");
        string15.add("2");
        string15.add("3");
        string15.add("4");
        string15.add("5");
        System.out.println("Before "+ string15);
        insertElement(string15,"New" ,1);
        System.out.println("After " + string15);

    }


    public static  void q17(){
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(2);

        boolean check = number1.containsAll(number2);
        System.out.println("number1 co chua number 2 k ? " + check );
    }

    public static void q18(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(20);
        linkedList.add(5);
        linkedList.add(0);
        linkedList.add(8);
        linkedList.add(-1);
        linkedList.sort(Comparator.comparingInt(o -> (int)o).reversed());
        System.out.println(linkedList);
    }

    public  static void q19(){
        HashSet<Integer> number19 = new HashSet<>();
        number19.add(2);
        number19.add(3);    number19.add(7);
        number19.add(4);
        number19.add(5);
        number19.add(6);
        System.out.println("List 19 " + number19);
    }

    public  static void q20(){
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        int firstElement = myList.get(0);
        int lastElement = myList.get(myList.size() - 1);

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}

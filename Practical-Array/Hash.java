import java.util.*;

public class Hash {
    public static void main(String[] args) {
    dedupe();
    classifyPrime();
    q3();
    }

    public static void dedupe( ){
        String str = "hello world";
        HashMap<Character, Integer> charCount = new HashMap<>();
        // Tính số lần xuất hiện của các ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Lấy danh sách các ký tự không trùng nhau
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                uniqueChars.add(c);
            }
        }

        // In ra danh sách các ký tự không trùng nhau
        System.out.println("Các ký tự không trùng nhau trong chuỗi : ");
        for (char c : uniqueChars) {
            System.out.println(c + " ");
        }
    }

    public static void classifyPrime(){
        HashMap<Integer,String> class1 = new HashMap<>();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,100,101,29,121};
        for ( int number : numbers){
            boolean isPrime = true;
            if(number <2){
                isPrime = false;
            }else{
                for (int i = 2 ; i <= Math.sqrt(number) ; i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println("Prime " + number);
            }else{
                System.out.println("Not Prime "+ number);
            }

        }


    }

    public  static void q3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

        // Đếm số lần xuất hiện của các ký tự trong chuỗi
        for (char c : input.toCharArray()) {
            if (charCounter.containsKey(c)) {
                charCounter.put(c, charCounter.get(c) + 1);
            } else {
                charCounter.put(c, 1);
            }
        }

        // In kết quả đếm
        for (char c : charCounter.keySet()) {
            System.out.println("'" + c + "' xuất hiện " + charCounter.get(c) + " lần");
        }
    }

    public static void q4(){
        HashMap<String,Integer> candidates = new HashMap<>();
        candidates.put("Obama",1);
        candidates.put("Abraham Lincon",2);


    }

    }




import java.util.*;

public class Array {
    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        System.out.println("Enter your String ");
//        var str = scanner.nextLine();
        System.out.println(timkiem("abcc"));
        System.out.println("vi tri " + search());
        System.out.println("them " + joinStr("-","tam","bla"));
        var rs = findMinMax(new int[]{1,2,3,4,5});
        System.out.println( rs );
    }



    public static String timkiem(String str){


        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            //day zo mang
            char c = str.charAt(i);
            if (!uniqueChars.add(c)) {
                repeatedChars.add(c);
            } else {
                uniqueChars.add(c);
            }
        }

        System.out.println("Các ký tự k trùng nhau: " + uniqueChars);
        return str;
    }

    public static char search(){

//        String b = "Devera KITs";
//        b.charAt(a);
//        return a;
//        myStr = "Devera KITs";
        String myStr = "Devera KITs";
        char result = myStr.charAt(5);
        System.out.println(result);
        return result;
    }

    public  static String joinStr (String delimiter , String... args){
        String s ="";
        for (int i = 0 ; i<args.length- 1 ; i++){
            s +=(args[i] + delimiter);

        }
        s += args[args.length - 1];
        return s;
    }

//    public static  String[][] groupBy(String arr) {
//
//        // Tách chuỗi thành các số nguyên
//        String[] parts = arr.split(" ");
//    }

    public static int[] findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1 ; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }else if (arr[i]>max){
                max = arr[i];
            }
        }
//        for (int num: arr) {
//            if(max < num)
//                max = num;
//        }
        System.out.println("max " + max);
        System.out.println("min " + min);
        return new int[]{max ,min};
    }


}

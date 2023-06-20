import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("nhap a");
        int a=sc.nextInt();
        check(a);
    }
    public static void check(int n){
        for (int i = 0; i<n ;i++){
            if(i%2==0){
                System.out.println("number even " + i);
            }
        }
    }
}

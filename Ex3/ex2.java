import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("nhap a");
        int a=sc.nextInt();
        System.out.println("nhap b");

        int b=sc.nextInt();
        if(a<b){
            System.out.println("-1");
        }else if(a==b) {
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }
}

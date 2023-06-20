import java.util.Scanner;

public class kimtuthap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("nhap a");
        int a=sc.nextInt();
        for (int i = 1 ; i<= a ;i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

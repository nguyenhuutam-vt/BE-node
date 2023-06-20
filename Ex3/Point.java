import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int variable;
        System.out.println("Please enter the variable value");

        variable=sc.nextInt();
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);
        if(variable >=80 && variable<=100){
            System.out.println("thang diem A");
        }else if(variable >=60 && variable<=79) {
            System.out.println("thang diem B");
        } else if (variable >=40 &&variable <=59) {
            System.out.println("thang diem C");
        } else if (variable>=20 && variable<39) {
            System.out.println("thang diem D");
        } else if (variable >= 0 && variable <19) {
            System.out.println("thang diem E");
        }else {
            System.out.println("Nhap lai");

        }
    }
}

import java.util.Scanner;

@FunctionalInterface
interface Mathh{
    int opera(int a , int b);
}
public class Calculator {

    public int add(int a , int b){
        return a +b;
    }
    public int division(int a , int b) {return  a / b;}

    public String chuoi(String a){
        return a ;
    }
    public int even(int a){
        if(a%2 ==0){
            System.out.print("even ");
        }else {
            System.out.print("not even ");
        }
        return a;
    }
    public  short aShort(){
       short a= 2;
       short b=-5;
       short sum = (short) (a +b);
       return sum;
    }
    public  double factorial(double a){
        double fac=1;
        for(int i= 1 ; i<=a ; i++){
            fac= fac*i;
        }
    return fac;
    }

    public  int averagee(){
        System.out.println("Nhập vào số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("Kết quả là: %.3f ", average);
        return (int) average;
    }

    public  int findMax (){
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        //khai báo biến n là số lượng phần tử trong mảng
        int n;
        System.out.print("\n\nNhập số lượng phần tử cho mảng: ");
        n = sc.nextInt();
        int numberArr[] = new int[n];
        //nhập giá trị cho từng phần tử trong mảng
        for (int i = 1; i < n; i++) {
            System.out.print("\nNhập phần tử thứ " + i + ": ");
            numberArr[i] = sc.nextInt();
        }
        //in các phần tử trong mảng ra màn hình
        System.out.println("Các phần tử trong mảng là: ");
        for(double i : numberArr){
            System.out.print(i + ", ");
        }
        double max = numberArr[0];
        //dùng vòng lặp for duyệt các phần tử trong mảng. so sánh max với từng phần tử nếu số nào lớn hơn max thì gán nó cho max.
        // cứ lặp như vậy cho đến hết các phần tử thì max sẽ là giá trị lớn nhất trong mảng
        for (double num: numberArr) {
            if(max < num)
                max = num;
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %.2f ", max);
        return (int) max;
    }

    public int canhHuyen(int a , int b){
        return (int) Math.sqrt((a * a) + (b * b));
    }

    public char findLast (){
        String a ="tam";
        var b=  a.charAt(a.length()-1);
        return b;
    }

    public int pyramid(int n){
        int rs = 0;
        for (int i = 1; i <= n; ++i, rs=0) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            while (rs != 2 * i - 1) {
                System.out.print("* ");
                ++rs;
            }
            System.out.println();
        }
        return n;
    }
    }





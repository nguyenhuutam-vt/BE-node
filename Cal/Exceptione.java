import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptione {
    public static void main(String[] args) {

        try {
            processFile("example.txt");
            double result = divided(10,0);
            System.out.println("Result " +result);
        }catch (Exception e){
            System.out.println("Da xay ra loi " + e.getMessage());
        }

//        try{
//            int[] numbers = {1,2,3};
//            int result =divided(numbers,1);
//            System.out.println("Result " + result);
//        }catch(ArithmeticException ex){
//            System.out.println("ArithmeticException " + ex.getMessage());
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("ArrayIndexOutOfBoundsException " + ex.getMessage());
//        }catch (Exception ex){
//            System.out.println("Generic Exception " + ex.getMessage());
//        }finally {
//            System.out.println("Clean code goes here");
//        }
    }
    public static int divided(double a , double b ){
//        int result = 0;
//
//        try {
//            result = numbers[0]/ divisor;
//        }catch (ArithmeticException ex){
//            throw ex;
//
//        }catch (ArrayIndexOutOfBoundsException ex){
//            throw ex;
//        }
//        return result;
        try {
            return (int) (a / b);
        }catch (Exception e){
            return (int) 0D;
        }
    }

    public static void processFile (String filename) throws IOException {
        Integer divided = 10/ 2;
        System.out.println("divided "+divided);
        FileReader fileReader;
        fileReader = new FileReader(filename);
        fileReader.close();

    }

}



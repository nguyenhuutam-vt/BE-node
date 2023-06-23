public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(3,4);
        int division = calc.division(4,2);
        //1
        System.out.println("result "+ division);
        //2
        System.out.println("ki tu dau tien " + calc.chuoi("Hello").charAt(0));
        //3
        System.out.println( calc.even(3));
        //4
        System.out.println("sum " + calc.aShort());
        //5
        System.out.println("fac "+ calc.factorial(1000));
        //6
//        System.out.println(  calc.averagee());
        //7
  //      System.out.println(calc.findMax());
        //8
        System.out.println("canh huyen "+calc.canhHuyen(4,5));
        //9
        System.out.println("last char " + calc.findLast());
        //10
        System.out.println("pyramid " + calc.pyramid(5));

      Mathh addition = ( (a, b) -> a + b);
      int rs = addition.opera(3,4);
        System.out.println("Rs " + rs);

    }
}

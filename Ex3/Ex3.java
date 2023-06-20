public class Ex3 {
    public static void main(String[] args) {

        //1
        byte myNum = 100;
        System.out.println("byte" +myNum);
        String string = "Hello";
        System.out.println("String "+string);
        char myGrade = 'B';
        System.out.println("char " + myGrade);
        int myInt = 123;
        System.out.println("int " + myInt);
        long mylong = 9999999;
        System.out.println("long " + mylong);
        double myDouble = 19.99d;
        System.out.println("double "+myDouble);
        float myFloat = 5.77f;
        System.out.println("float "+myFloat);


        //2
        boolean isBoolean = true;
        isBoolean = !isBoolean;
        System.out.println("gia tri dao nguoc " +isBoolean);


        //3
        int intConver = 100;
        long longconver = (long) intConver;
        int intConverr = (int)longconver;
        System.out.println("convert int to long " + longconver);
        System.out.println("convert long to int " + intConverr);


        //4
        String s="hello";
//        char c=s.charAt(1);//returns h
//        System.out.println("1st character is: "+c);
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.println("char at "+i+" index is: "+c);
        }
        //character array
        char[] ch = {'w', 'e', 'l', 'c', 'o', 'm', 'e', ' ' , 't', 'o', ' ', 'J', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
//constructor of the String class that parses char array as a parameter
        String stringArray = new String(ch);
//prints the string
        System.out.println(stringArray);


        //5
        System.out.println("Short Max Value: " + Short.MAX_VALUE);
        System.out.println("Short Min Value: " + Short.MIN_VALUE);

// Giá trị max và min của kiểu int
        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);
        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);

// Giá trị max và min của kiểu long
        System.out.println("Long Max Value: " + Long.MAX_VALUE);
        System.out.println("Long Min Value: " + Long.MIN_VALUE);

// Giá trị max và min của kiểu double
        System.out.println("Double Max Value: " + Double.MAX_VALUE);
        System.out.println("Double Min Value: " + Double.MIN_VALUE);

// Giá trị max và min của kiểu float
        System.out.println("Float Max Value: " + Float.MAX_VALUE);
        System.out.println("Float Min Value: " + Float.MIN_VALUE);
    }
}

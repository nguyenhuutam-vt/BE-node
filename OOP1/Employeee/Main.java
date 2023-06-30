public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("tam","123","J48" ,123);
        e1.displayEmployee();
        System.out.println("=====================");
        Engineer engineer = new Engineer("tam123","456" , "J489","asd");
        engineer.displayEmployee();
    }
}

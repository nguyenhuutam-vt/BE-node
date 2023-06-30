public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Audi","red",2023);
//        car.displayInfo();
//        car.setBrand("audiii");
//        car.displayInfo();
//
//        Carr carr =new SportCar("Ferrari","Red",100000);
//        carr.start();
//        carr.displayInfo();
//
//        InterfaceCar car1 = new SportCarInterface("Audii");
//        car1.start();
//        car1.stop();
//        car1.drive(100);

//        University u1 = new University("tam","123",2023 ,"FPT");
//        u1.School();
//
//        College c1 = new College("tam" ,"123",2023,"VTT");
//        c1.School();
//
//        Circle cr =  new Circle(3,3.14);
//        cr.calculateAre();
//        cr.calculatePerimeter();
//
//        Rectangel rec = new Rectangel(4,5);
//        rec.calculateAre();
//        rec.calculatePerimeter();
//
//        Triangle triangle = new Triangle(5,7,3,4,2);
//        triangle.calculateAre();
//        triangle.calculatePerimeter();
//
//        Contact contact = new FriendContact("tam",12345678,"tam@gmail.com");
//        contact.start();
//
//        Contact contact1 = new WorkContact("tam123",123456,"tam123@gmail.com");
//        contact1.start();
//
//        JPEGImage img = new JPEGImage(12,13,14);
//        img.display();
//        img.resize(21,22);
//        img.roate(360);
//        img.applyFilter();


        ChildClass childClass = new ChildClass();
        childClass.protectedMethod();
        childClass.printMessage();
       // childClass.childMethod();

        Day today = Day.Monday;
        System.out.println("Today is " + today);
        if (today == Day.Saturday || today== Day.Sunday){
            System.out.println("This is Weekend");
        }
        else{
            System.out.println("Its a Weekday");
        }
        switch (today){
            case Monday:
            case Tuesday:
            case Thursday:
            case Friday:
            case Wednesday:
                System.out.println("Its a Weekday");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Its a Weekend");
                break;
        }

    }
}

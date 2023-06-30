public class ChildClass extends ParentClass{
    public void childMethod(){
        System.out.println("this is a child method");
        System.out.println("Accessing " + protectedVariable);
//        protectedMethod();
    }
}

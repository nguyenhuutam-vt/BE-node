public class College extends Student {
    private String college;
    public College(String name , String id , int year , String college){
        super(name, id, year);
        this.college = college;
    }

    @Override
    public void School() {
        System.out.println("College " + college);
    }
}

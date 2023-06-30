 class University extends Student {
    private String university;
    private String college;
   public University(String name , String id , int year , String university){
       super(name,name,year);
       this.university= university;
   }

     @Override
     public void School() {
         System.out.println("This is University "+university);
     }

 }

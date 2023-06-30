 class SportCarInterface implements InterfaceCar{
    private String brand;
    public SportCarInterface(String brand){
        this.brand =brand;
    }

     @Override
     public void start() {
         System.out.println(brand + " sports car starting");
     }

     @Override
     public void stop() {
         System.out.println(brand + " sports car stop");
     }

     @Override
     public void drive(double distance) {
         System.out.println(brand + " sports car drive " + distance);
     }
 }

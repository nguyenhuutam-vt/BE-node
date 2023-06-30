public class Employee {
    public String name ;
    public String id ;
    public String address;

    public Employee(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayEmployee(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Address : " + address);
    }
}

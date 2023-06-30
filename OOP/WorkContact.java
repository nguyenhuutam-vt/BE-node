public class WorkContact implements Contact{
    private String name;
    private int phone;
    private String contact;

    public WorkContact(String name, int phone, String contact) {
        this.name = name;
        this.phone = phone;
        this.contact = contact;
    }

    @Override
    public void start() {
        System.out.println("============ Work contact ======== ");
        System.out.println("Name "+name);
        System.out.println("Phone " + phone);
        System.out.println("Contact " + contact);
    }
}

 class FriendContact implements Contact {
    private String name;
     private int phone;
     private String contact;

     public FriendContact(String name, int phone, String contact) {
         this.name= name;
         this.phone =phone;
         this.contact = contact;
     }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public void start() {
        System.out.println("============ Friend Contact ============= ");
        System.out.println("Name " + name);
        System.out.println("Phone " + phone);
        System.out.println("Contact "+contact);
    }
}

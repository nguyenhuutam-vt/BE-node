abstract class Student {
    private String name;
    private String id;
    private int year ;

    public Student(String name, String id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }


    public abstract void School();
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

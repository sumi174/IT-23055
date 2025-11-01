class Student {
    private String name;
    private String id;

    public void setData(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void showData() {
        System.out.println("Name: " + name + ", Id: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Sumi", "it23055");
        s.showData();
    }
}

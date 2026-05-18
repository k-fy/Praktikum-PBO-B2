
public class Person {
    private int id;
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public Person (int id, String n) {
        this.id = id;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

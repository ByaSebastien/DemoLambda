package be.bstorm.models;

public class Person {
    private static Long nextID = 1L;

    private Long id;
    private String name;

    public Person(String name) {
        this.id = nextID++;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

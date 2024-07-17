import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public int age;

    public Employee() {
    }

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}

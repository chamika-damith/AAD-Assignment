import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name="chamika";
        employee.address="colombo";
        employee.age=22;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Employee created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args) {
        Employee employee=null;

        try {
            FileInputStream fileInputStream = new FileInputStream("D:/project/AAD/R&D Assignment/assignment/employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            System.out.println(employee.name+" "+employee.address+" "+employee.age);
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

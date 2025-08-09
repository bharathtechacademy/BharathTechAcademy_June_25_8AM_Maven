package transientExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientExample {
    public static void main(String[] args) {
        User user = new User("bharath", "secret123");        
        System.out.println(user.password);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("✅ User serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("📦 Username: " + deserializedUser.username);
            System.out.println("🔐 Password: " + deserializedUser.password);  // will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


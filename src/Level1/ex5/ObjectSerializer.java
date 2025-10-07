package Level1.ex5;

import java.io.*;

public class ObjectSerializer {

    public static void serializeObject(Object obj, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            System.out.println("Object serialized successfully to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error during serialization " + e.getMessage());
        }
    }

    public static Object deserializeObject(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj = ois.readObject();
            System.out.println("Object deserialized successfully from : " + filePath);
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization " + e.getMessage());
            return null;
        }

    }
}

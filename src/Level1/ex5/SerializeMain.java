package Level1.ex5;

public class SerializeMain {
    public static void main(String[] args){
        String filePath = "C:\\\\Users\\\\formacio\\\\Desktop\\\\Youssef\\\\Task-S1.05\\\\person.ser";

        Person person1 = new Person("Youssef", 25, "Spain", "09-07-2000");

        ObjectSerializer.serializeObject(person1, filePath);

        Person deserializedPerson = (Person) ObjectSerializer.deserializeObject(filePath);

        System.out.println("Deserialized object: " + deserializedPerson);


    }
}

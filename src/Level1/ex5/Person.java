package Level1.ex5;

import java.io.Serializable;

public class Person  implements Serializable {
    private String name;
    private int age;
    private String country;
    private String birthday;


    public Person (String name, int age, String country, String birthday ){
        this.name = name;
        this.age = age;
        this.country = country;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getBirthday() {
        return birthday;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", birthday='" + birthday + '\'';
    }
}

package lesson3.human;

import java.util.Objects;

public class Human {
    private String name;
    private short age;
    private String gender;
    private String city;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, short age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(this.getName()) && human.getAge() == this.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName() + this.getAge());
    }
}

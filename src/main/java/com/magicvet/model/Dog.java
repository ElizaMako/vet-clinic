package main.java.com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet implements Comparable<Dog> {

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";



    private String size;

    private String age;




    public Dog() { }

    public Dog(String size, String age) {
        this.size = size;
        this.age = age;
    }

    public Dog(String size) {
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "Client {"
                + "\n\tsize = " + size;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(size);
    }


    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog otherDog) {

        int thisAge = Integer.parseInt(this.getAge());

        int otherAge = Integer.parseInt(otherDog.getAge());

        return Integer.compare(thisAge, otherAge);
    }
}

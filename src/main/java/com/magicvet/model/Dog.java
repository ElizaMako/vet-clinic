package main.java.com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet implements Comparable<Dog> {


    private Size size;

    private String age;

    @Override
    public HealthState getHealthState() {
        return healthState;
    }

    private HealthState healthState;



    public Dog() { }

    public Dog(HealthState healthState) {
        this.healthState = healthState;
    }

    public Dog(Size size, String age) {
        this.size = size;
        this.age = age;
    }

    public Dog(Size size) {
        this.size = size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

   /*
    public String getSize() {
        return size;
    }
   */
   @Override
    public String toString() {
       return "Client {"
               + "type = " + getType()
               + ", sex = "  + getSex()
               + ", age = " + getAge()
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

    public Size getSize() {
        return size;
    }

    public enum Size {

       XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0)
        ;

        private final int value;

       Size(int value) {
           this.value = value;
       }

        public int getValue() {
            return value;
        }
    }
}

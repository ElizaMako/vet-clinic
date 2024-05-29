package main.java.com.magicvet.model;

import java.util.Objects;

public  class Pet {

    private HealthState healthState;

    private String type;

    private String sex;

    private String age;

    private String name;

    private String ownerName;

    public Pet(){}

    public Pet(HealthState healthState) {
        this.healthState = healthState;
    }

    @Override
    public String toString() {
        return "Client {"
                + "\n\ttype = " + type
                + ", sex = " + sex
                + ", age = " + age
                +",\n\tname = " + name
                +",\n\towner`s name = " + ownerName
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type)
                && Objects.equals(sex, pet.sex)
                && Objects.equals(age, pet.age)
                && Objects.equals(name, pet.name)
                && Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public enum HealthState {

        URGENT(1),
        BAD(2),
        MODERATELY(3),
        GOOD(4),
        HEALTHY(5)
        ;


        private final int value;

        HealthState(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}

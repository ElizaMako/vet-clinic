package main.java.com.magicvet;

import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Dog;

import java.util.Arrays;

public class Sandbox {

    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog(Dog.S),
                new Dog(Dog.M),
                new Dog(Dog.XS),
                new Dog(Dog.XL),
                new Dog(Dog.S),
                new Dog(Dog.S),
        };

        Arrays.sort(dogs, new DogSizeComparator());

        for (Dog dog : dogs) {
            System.out.println(dog.getSize());
        }

        Dog[] dogsAge = {
                new Dog(Dog.S,"2"),
                new Dog(Dog.XL, "5"),
                new Dog(Dog.M, "1"),
                new Dog(Dog.XL, "10"),
                new Dog(Dog.S,"3"),
                new Dog(Dog.XL, "2"),
                new Dog(Dog.S,"6"),
        };

        Arrays.sort(dogsAge);
        System.out.println("Sorting dogs by age: ");

        for (Dog dog : dogsAge) {

            System.out.println(dog.getAge());
        }

    }
}

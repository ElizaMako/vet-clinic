package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

public class PetService {

    private static final String DOG_TYPE = "dog";
    private static final String CAT_TYPE = "cat";

    public Pet registerNewPet() {
        Pet pet = null;
        System.out.print("Type (dog / cat): ");

        String type = Main.SCANNER.nextLine();

        if (DOG_TYPE.equals(type) || CAT_TYPE.equals(type)) {
            pet = buildPet(type);
        } else {
            System.out.println("Unknown pet type: " + type);
        }
        return pet;
    }




    private Pet buildPet(String type) {
        Pet pet = type.equals(CAT_TYPE) ? new Cat() : new
                Dog();
        pet.setType(type);

        System.out.println("Age: ");
        pet.setAge(Main.SCANNER.nextLine());

        System.out.println("Name: ");
        pet.setName(Main.SCANNER.nextLine());

        System.out.println("Sex (male / female): ");
        pet.setSex(Main.SCANNER.nextLine());

        System.out.println("Health state: (URGENT, BAD, MODERATELY, GOOD, HEALTHY)");
        pet.setHealthState(Pet.HealthState.valueOf(Main.SCANNER.nextLine()));

        if(type.equals(DOG_TYPE)) {
            System.out.println("Size (XS / S / M / L / XXL): ");
            String size = Main.SCANNER.nextLine();
            ((Dog) pet).setSize(Dog.Size.fromString(size));

            // верхній рядок змінюю з цього ((Dog) pet).setSize(Dog.Size.valueOf(size));
        }

        return pet;
    }
}
